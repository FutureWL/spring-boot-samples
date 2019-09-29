/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.pigx.common.sequence;

import com.pig4cloud.pigx.common.sequence.builder.DbSeqBuilder;
import com.pig4cloud.pigx.common.sequence.builder.RedisSeqBuilder;
import com.pig4cloud.pigx.common.sequence.builder.SnowflakeSeqBuilder;
import com.pig4cloud.pigx.common.sequence.properties.SequenceDbProperties;
import com.pig4cloud.pigx.common.sequence.properties.SequenceRedisProperties;
import com.pig4cloud.pigx.common.sequence.properties.SequenceSnowflakeProperties;
import com.pig4cloud.pigx.common.sequence.range.impl.name.DateBizName;
import com.pig4cloud.pigx.common.sequence.range.impl.name.DefaultBizName;
import com.pig4cloud.pigx.common.sequence.sequence.Sequence;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author lengleng
 * @date 2019-05-26
 */
@Configuration
@ComponentScan("com.pig4cloud.pigx.common.sequence")
@ConditionalOnMissingBean(Sequence.class)
public class SequenceAutoConfiguration {

	/**
	 * 数据库作为发号器的存储介质
	 *
	 * @param dataSource
	 * @param properties
	 * @return
	 */
	@Bean
	@ConditionalOnBean(SequenceDbProperties.class)
	public Sequence dbSequence(DataSource dataSource,
							   SequenceDbProperties properties) {
		return DbSeqBuilder
				.create()
				.bizName(new DefaultBizName(properties.getBizName()))
				.dataSource(dataSource)
				.step(properties.getStep())
				.retryTimes(properties.getRetryTimes())
				.tableName(properties.getTableName())
				.build();
	}

	/**
	 * Redis 作为发号器的存储介质
	 *
	 * @param redisProperties
	 * @param properties
	 * @return
	 */
	@Bean
	@ConditionalOnBean(SequenceRedisProperties.class)
	public Sequence redisSequence(RedisProperties redisProperties,
								  SequenceRedisProperties properties) {
		return RedisSeqBuilder
				.create()
				.bizName(new DateBizName(properties.getBizName()))
				.ip(redisProperties.getHost())
				.port(redisProperties.getPort())
				.auth(redisProperties.getPassword())
				.step(properties.getStep())
				.build();
	}

	/**
	 * snowflak 算法作为发号器实现
	 *
	 * @param properties
	 * @return
	 */
	@Bean
	@ConditionalOnBean(SequenceSnowflakeProperties.class)
	public Sequence snowflakeSequence(SequenceSnowflakeProperties properties) {
		return SnowflakeSeqBuilder
				.create()
				.datacenterId(properties.getDatacenterId())
				.workerId(properties.getWorkerId())
				.build();
	}
}