package com.jwt.study.demo.rest;

import generator.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author jiangwentao
 * @date 2019/11/8
 */
@Component
@Scope("prototype")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Path("/test/")
@Slf4j
public class TestResource {

    @Path("index")
    @GET
    public String index() {
        log.info("hello world demo run");
        return "hello world!";
    }

    public static void main(String[] args) {
        Student student = new Student();
        Long id = student.getId();
    }
}
