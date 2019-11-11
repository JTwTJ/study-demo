package com.jwt.study.demo.rest;

import com.jwt.study.demo.data.bo.StudentBO;
import com.jwt.study.demo.data.po.Student;
import com.jwt.study.demo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.ws.rs.*;
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
@Validated
public class TestResource {

    @Autowired
    private StudentService studentService;

    @Path("index")
    @GET
    public String index() {

        log.info("hello world demo run");
        return "hello world!";
    }

    /**
     * 新建学生信息
     * @param studentBO 学生信息
     * @return 创建结果
     */
    @Path("create")
    @POST
    public Boolean createStudent(@Valid StudentBO studentBO) {

        log.info("create student param StudentBO:{}", studentBO);
        return studentService.createStudent(studentBO);
    }
}
