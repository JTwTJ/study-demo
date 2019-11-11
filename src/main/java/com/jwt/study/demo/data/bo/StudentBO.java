package com.jwt.study.demo.data.bo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author jiangwentao
 * @date 2019/11/11
 */
@Data
public class StudentBO {

    private Long id;

    @NotBlank(message = "姓名不能为空")
    private String name;

    @NotNull(message = "年级id不能为空")
    private Long gradeId;

    @NotNull(message = "学科id不能为空")
    private Long subjectId;

    @NotNull(message = "班级id不能为空")
    private Long classId;
}
