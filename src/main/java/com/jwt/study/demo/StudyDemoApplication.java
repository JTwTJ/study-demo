package com.jwt.study.demo;

import com.jwt.study.demo.rest.TestResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * 启动类
 * @author jiangwentao
 */
@SpringBootApplication
public class StudyDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyDemoApplication.class, args);
    }

//    /**
//     * 第二种配置jersey方式 application.properties里配置spring.jersey.application-path=映射地址
//     */
//    @Bean
//    public ResourceConfig resourceConfig() {
//        ResourceConfig config = new ResourceConfig();
//        config.register(TestResource.class);
//        return config;
//    }

//    /**
//     * 第三种配置jersey方式 SpringBoot提供了一个ResourceConfigCustomizer接口，让我们更灵活的对ResourceConfig对象进行配置,
//     * spring.jersey.application-path=映射地址。
//     */
//    @Bean
//    public ResourceConfig resourceConfig() {
//        return new ResourceConfig();
//    }
}
