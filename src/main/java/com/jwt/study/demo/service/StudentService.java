package com.jwt.study.demo.service;

import com.jwt.study.demo.data.bo.StudentBO;
import com.jwt.study.demo.data.po.Student;
import com.jwt.study.demo.mapper.StudentMapper;
import com.jwt.study.demo.util.Snowflake;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jiangwentao
 * @date 2019/11/11
 */
@Service
@Slf4j
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private Snowflake snowflake;


    public Boolean createStudent(StudentBO studentBO) {

        Student student = Student.convertToPO(studentBO);
        student.setId(Long.parseLong(snowflake.getId()));

        Integer count = studentMapper.insert(student);
        if (count != 1) {
            log.error("insert student fail");
            throw new RuntimeException("插入学生信息失败");
        }
        return true;
    }
}
