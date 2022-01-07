# 更新日志

> 12 月 21 日官方发布了 Spring Boot 2.6.2 版本，此版本包括 55 个错误修复、文档改进和依赖项升级。

## BUG 修复
- 当 getter 或 setter 被覆盖以使用属性类型的子类时，配置属性绑定期间使用的 getter 和 setter 会有所不同
- DatabaseInitializationDependencyConfigurer触发了factory beans的饿加载
- 在 Spring Boot 2.6.0 中,Quartz无法在mysql/mariadb数据库下建表
- Quartz, Session, Integration和 Batch的数据库平台初始化无法被配置
- 依赖thymeleaf-extras-springsecurity5但没有包含Spring Security时，应用启动失败
- 使用 Spring Security 时，ResponseStatusException没有返回响应体
- DatabaseInitializationMode为never时，DataSourceScriptDatabaseInitializer依然尝试访问数据库
- 在 Spring Boot 2.6.1 中，设置useCodeAsDefaultMessage属性为true时导致Hibernate validation messages无法正常工作
- 没有设置镜像构建包的标签时，不会默认设置latest
- 使用 maven 编译 war 文件时出现无效的类路径索引清单属性
- 发布到兼容 Servlet3.1 规范的容器时，org.springframework.boot.web.servlet.filter.ErrorPageSecurityFilter出现的抽象方法错误
- 为健康检查端点设置缓存time-to-live属性无效
- server.servlet.session.cookie.same-site无法被应用在 spring-session 创建的 Cookie

## 文档改进
- 2.5.x 快照文档链接到主分支上的源代码
- WebFlux 不支持将 DevTools 与远程应用程序一起使用的文档
- 发布在核心功能参考文档中创建您自己的自动配置部分
- 发布参考文档中的 CacheManager 自定义部分
- 发布 README.adoc
- 修复属性 spring.mvc.pathmatch.matching-strategy 的记录默认值
- 在参考文档的 YAML 示例中添加一致的引号

## 依赖项升级
- Upgrade to Logback 1.2.9
- Upgrade to AppEngine SDK 1.9.93
- Upgrade to Caffeine 2.9.3
- Upgrade to Couchbase Client 3.2.4
- Upgrade to DB2 JDBC 11.5.7.0
- Upgrade to Dropwizard Metrics 4.2.7
- Upgrade to Ehcache3 3.9.9
- Upgrade to Flyway 8.0.5
- Upgrade to Hazelcast 4.2.4
- Upgrade to Hibernate 5.6.3.Final
- Upgrade to HttpAsyncClient 4.1.5
- Upgrade to HttpCore 4.4.15
- Upgrade to Infinispan 12.1.10.Final
- Upgrade to Jackson Bom 2.13.1
- Upgrade to JDOM2 2.0.6.1
- Upgrade to Jedis 3.7.1
- Upgrade to JUnit Jupiter 5.8.2
- Upgrade to Kotlin 1.6.10
- Upgrade to Log4j2 2.17.0
- Upgrade to Micrometer 1.8.1
- Upgrade to MSSQL JDBC 9.4.1.jre8
- Upgrade to Netty 4.1.72.Final
- Upgrade to Reactor 2020.0.14
- Upgrade to Spring AMQP 2.4.1
- Upgrade to Spring Framework 5.3.14
- Upgrade to Spring Integration 5.5.7
- Upgrade to Spring Kafka 2.8.1
- Upgrade to Spring LDAP 2.3.5
- Upgrade to Spring Security 5.6.1
- Upgrade to Spring Session 2021.1.1
- Upgrade to Spring WS 3.1.2
- Upgrade to Thymeleaf 3.0.14.RELEASE
- Upgrade to Tomcat 9.0.56
- Upgrade to Undertow 2.2.14.Final
- Upgrade to XmlUnit2 2.8.4