package com.jwt.study.demo.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jwt.study.demo.data.po.Student;
import org.springframework.stereotype.Repository;

/**
 * @author jiangwentao
 */
@Repository
public interface StudentMapper extends BaseMapper<Student> {
    int deleteByPrimaryKey(Long id);

    Integer insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}