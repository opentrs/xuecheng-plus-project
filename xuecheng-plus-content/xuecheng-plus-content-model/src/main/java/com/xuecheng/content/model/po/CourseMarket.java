package com.xuecheng.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
    * 课程营销信息
    */
@Data
@TableName(value = "xcplus_db.course_market")
public class CourseMarket {
    /**
     * 主键，课程id
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 收费规则，对应数据字典
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
     * 咨询qq
     */
    @TableField(value = "qq")
    private String qq;

    /**
     * 微信
     */
    @TableField(value = "wechat")
    private String wechat;

    /**
     * 电话
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 有效期天数
     */
    @TableField(value = "valid_days")
    private Integer validDays;

    public static final String COL_ID = "id";

    public static final String COL_CHARGE = "charge";

    public static final String COL_PRICE = "price";

    public static final String COL_ORIGINAL_PRICE = "original_price";

    public static final String COL_QQ = "qq";

    public static final String COL_WECHAT = "wechat";

    public static final String COL_PHONE = "phone";

    public static final String COL_VALID_DAYS = "valid_days";
}