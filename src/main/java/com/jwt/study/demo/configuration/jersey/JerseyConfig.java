package com.jwt.study.demo.configuration.jersey;

import com.jwt.study.demo.rest.TestResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

/**
 * jersey配置
 * @author jiangwentao
 * @date 2019/11/8
 */
@Configuration
@ApplicationPath("/api/rest")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        /*
        即使用Jersey的packages是比较局限的，比如在应用运行在war包中的时候，
        就不能扫描到其中的包。所以建议单独的为每一个资源类独立使用register方法注册。
        */
        this.packages("com.jwt.study.demo.rest");
        //this.register(TestResource.class);
    }
}
