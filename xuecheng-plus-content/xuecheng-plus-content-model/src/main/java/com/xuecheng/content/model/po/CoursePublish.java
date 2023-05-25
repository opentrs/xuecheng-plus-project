package com.xuecheng.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

/**
    * 课程发布
    */
@Data
@TableName(value = "xcplus_db.course_publish")
public class CoursePublish {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 机构ID
     */
    @TableField(value = "company_id")
    private Long companyId;

    /**
     * 公司名称
     */
    @TableField(value = "company_name")
    private String companyName;

    /**
     * 课程名称
     */
    @TableField(value = "`name`")
    private String name;

    /**
     * 适用人群
     */
    @TableField(value = "users")
    private String users;

    /**
     * 标签
     */
    @TableField(value = "tags")
    private String tags;

    /**
     * 创建人
     */
    @TableField(value = "username")
    private String username;

    /**
     * 大分类
     */
    @TableField(value = "mt")
    private String mt;

    /**
     * 大分类名称
     */
    @TableField(value = "mt_name")
    private String mtName;

    /**
     * 小分类
     */
    @TableField(value = "st")
    private String st;

    /**
     * 小分类名称
     */
    @TableField(value = "st_name")
    private String stName;

    /**
     * 课程等级
     */
    @TableField(value = "grade")
    private String grade;

    /**
     * 教育模式
     */
    @TableField(value = "teachmode")
    private String teachmode;

    /**
     * 课程图片
     */
    @TableField(value = "pic")
    private String pic;

    /**
     * 课程介绍
     */
    @TableField(value = "description")
    private String description;

    /**
     * 课程营销信息，json格式
     */
    @TableField(value = "market")
    private String market;

    /**
     * 所有课程计划，json格式
     */
    @TableField(value = "teachplan")
    private String teachplan;

    /**
     * 教师信息，json格式
     */
    @TableField(value = "teachers")
    private String teachers;

    /**
     * 发布时间
     */
    @TableField(value = "create_date")
    private Date createDate;

    /**
     * 上架时间
     */
    @TableField(value = "online_date")
    private Date onlineDate;

    /**
     * 下架时间
     */
    @TableField(value = "offline_date")
    private Date offlineDate;

    /**
     * 发布状态
     */
    @TableField(value = "`status`")
    private String status;

    /**
     * 备注
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 收费规则，对应数据字典--203
     */
    @TableField(value = "charge")
    private String charge;

    /**
     * 现价
     */
    @TableField(value = "price")
    private Double price;

    /**
     * 原价
     */
    @TableField(value = "original_price")
    private Double originalPrice;

    /**
     * 课程有效期天数
     */
    @TableField(value = "valid_days")
    private Integer validDays;

    public static final String COL_ID = "id";

    public static final String COL_COMPANY_ID = "company_id";

    public static final String COL_COMPANY_NAME = "company_name";

    public static final String COL_NAME = "name";

    public static final String COL_USERS = "users";

    public static final String COL_TAGS = "tags";

    public static final String COL_USERNAME = "username";

    public static final String COL_MT = "mt";

    public static final String COL_MT_NAME = "mt_name";

    public static final String COL_ST = "st";

    public static final String COL_ST_NAME = "st_name";

    public static final String COL_GRADE = "grade";

    public static final String COL_TEACHMODE = "teachmode";

    public static final String COL_PIC = "pic";

    public static final String COL_DESCRIPTION = "description";

    public static final String COL_MARKET = "market";

    public static final String COL_TEACHPLAN = "teachplan";

    public static final String COL_TEACHERS = "teachers";

    public static final String COL_CREATE_DATE = "create_date";

    public static final String COL_ONLINE_DATE = "online_date";

    public static final String COL_OFFLINE_DATE = "offline_date";

    public static final String COL_STATUS = "status";

    public static final String COL_REMARK = "remark";

    public static final String COL_CHARGE = "charge";

    public static final String COL_PRICE = "price";

    public static final String COL_ORIGINAL_PRICE = "original_price";

    public static final String COL_VALID_DAYS = "valid_days";
}