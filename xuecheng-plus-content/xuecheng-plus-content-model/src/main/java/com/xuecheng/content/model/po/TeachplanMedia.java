package com.xuecheng.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;

@Data
@TableName(value = "xcplus_db.teachplan_media")
public class TeachplanMedia {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 媒资文件id
     */
    @TableField(value = "media_id")
    private String mediaId;

    /**
     * 课程计划标识
     */
    @TableField(value = "teachplan_id")
    private Long teachplanId;

    /**
     * 课程标识
     */
    @TableField(value = "course_id")
    private Long courseId;

    /**
     * 媒资文件原始名称
     */
    @TableField(value = "media_fileName")
    private String mediaFilename;

    @TableField(value = "create_date")
    private Date createDate;

    /**
     * 创建人
     */
    @TableField(value = "create_people")
    private String createPeople;

    /**
     * 修改人
     */
    @TableField(value = "change_people")
    private String changePeople;

    public static final String COL_ID = "id";

    public static final String COL_MEDIA_ID = "media_id";

    public static final String COL_TEACHPLAN_ID = "teachplan_id";

    public static final String COL_COURSE_ID = "course_id";

    public static final String COL_MEDIA_FILENAME = "media_fileName";

    public static final String COL_CREATE_DATE = "create_date";

    public static final String COL_CREATE_PEOPLE = "create_people";

    public static final String COL_CHANGE_PEOPLE = "change_people";
}