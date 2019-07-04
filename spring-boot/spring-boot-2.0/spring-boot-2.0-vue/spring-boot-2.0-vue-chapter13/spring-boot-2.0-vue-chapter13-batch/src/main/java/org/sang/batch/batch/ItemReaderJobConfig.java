package org.sang.batch.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

//@Configuration
public class ItemReaderJobConfig {
    @Autowired
    JobBuilderFactory jobBuilderFactory;
    @Autowired
    StepBuilderFactory stepBuilderFactory;

    @Bean
    Step itemReaderStep() {
        return stepBuilderFactory.get("itemReaderStep")
                .chunk(2)
                .reader(new MyItemReader(Arrays.asList("三国", "水浒", "西游", "红楼")))
                .writer(list -> {
                    System.out.println(list);
                }).build();
    }
    @Bean
    Job itemReaderJob() {
        return jobBuilderFactory.get("itemReaderJob")
                .start(itemReaderStep())
                .build();
    }
}
