package com.xuecheng.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 课程-教师关系表
    */
@Data
@TableName(value = "xcplus_db.course_teacher")
public class CourseTeacher {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 课程标识
     */
    @TableField(value = "course_id")
    private Long courseId;

    /**
     * 教师标识
     */
    @TableField(value = "teacher_name")
    private String teacherName;

    /**
     * 教师职位
     */
    @TableField(value = "`position`")
    private String position;

    /**
     * 教师简介
     */
    @TableField(value = "introduction")
    private String introduction;

    /**
     * 照片
     */
    @TableField(value = "photograph")
    private String photograph;

    /**
     * 创建时间
     */
    @TableField(value = "create_date")
    private Date createDate;

    public static final String COL_ID = "id";

    public static final String COL_COURSE_ID = "course_id";

    public static final String COL_TEACHER_NAME = "teacher_name";

    public static final String COL_POSITION = "position";

    public static final String COL_INTRODUCTION = "introduction";

    public static final String COL_PHOTOGRAPH = "photograph";

    public static final String COL_CREATE_DATE = "create_date";
}