package com.xuecheng.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "xcplus_db.course_audit")
public class CourseAudit {
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 课程id
     */
    @TableField(value = "course_id")
    private Long courseId;

    /**
     * 审核意见
     */
    @TableField(value = "audit_mind")
    private String auditMind;

    /**
     * 审核状态
     */
    @TableField(value = "audit_status")
    private String auditStatus;

    /**
     * 审核人
     */
    @TableField(value = "audit_people")
    private String auditPeople;

    /**
     * 审核时间
     */
    @TableField(value = "audit_date")
    private Date auditDate;

    public static final String COL_ID = "id";

    public static final String COL_COURSE_ID = "course_id";

    public static final String COL_AUDIT_MIND = "audit_mind";

    public static final String COL_AUDIT_STATUS = "audit_status";

    public static final String COL_AUDIT_PEOPLE = "audit_people";

    public static final String COL_AUDIT_DATE = "audit_date";
}