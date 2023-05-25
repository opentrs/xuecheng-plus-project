package com.xuecheng.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 课程分类
    */
@Data
@TableName(value = "xcplus_db.course_category")
public class CourseCategory {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private String id;

    /**
     * 分类名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 分类标签默认和名称一样
     */
    @TableField(value = "`label`")
    private String label;

    /**
     * 父结点id（第一级的父节点是0，自关联字段id）
     */
    @TableField(value = "parentid")
    private String parentid;

    /**
     * 是否显示
     */
    @TableField(value = "is_show")
    private Byte isShow;

    /**
     * 排序字段
     */
    @TableField(value = "orderby")
    private Integer orderby;

    /**
     * 是否叶子
     */
    @TableField(value = "is_leaf")
    private Byte isLeaf;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_LABEL = "label";

    public static final String COL_PARENTID = "parentid";

    public static final String COL_IS_SHOW = "is_show";

    public static final String COL_ORDERBY = "orderby";

    public static final String COL_IS_LEAF = "is_leaf";
}