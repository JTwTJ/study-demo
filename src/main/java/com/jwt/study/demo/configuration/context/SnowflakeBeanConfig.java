package com.jwt.study.demo.configuration.context;

import com.jwt.study.demo.util.Snowflake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jiangwentao
 * @date 2019/11/11
 */
@Configuration
public class SnowflakeBeanConfig {

    @Bean
    public Snowflake getSnowflake() {
        return new Snowflake(0, 0);
    }
}
