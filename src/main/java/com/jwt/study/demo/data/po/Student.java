package com.jwt.study.demo.data.po;

import com.jwt.study.demo.data.bo.StudentBO;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * student
 * @author jiangwentao
 */
@Data
public class Student implements Serializable {
    /**
     * 主键id
     */
    private Long id;

    /**
     * 学生名字
     */
    private String name;

    /**
     * 年级id
     */
    private Long gradeId;

    /**
     * 学科id
     */
    private Long subjectId;

    /**
     * 班级id
     */
    private Long classId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public static Student convertToPO(StudentBO studentBO) {

        Student student = new Student();
        student.setName(studentBO.getName());
        student.setGradeId(studentBO.getGradeId());
        student.setSubjectId(studentBO.getSubjectId());
        student.setClassId(studentBO.getClassId());
        return student;
    }
}