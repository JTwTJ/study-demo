package generator;

import lombok.Data;
import lombok.Getter;

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
    @Getter
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
    private String classId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}