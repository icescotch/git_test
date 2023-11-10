package com.baizhi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName yx_video
 */
@TableName(value ="yx_video")
@Data
public class Video implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 标题
     */
    @TableField(value = "title")
    private String title;

    /**
     * 简介
     */
    @TableField(value = "description")
    private String description;

    /**
     * 封面地址
     */
    @TableField(value = "cover_path")
    private String coverPath;

    /**
     * 视频地址
     */
    @TableField(value = "video_path")
    private String videoPath;

    /**
     * 状态
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 类别 - 是一对一的关系
     */
    private Category category;

    /**
     * 用户 - 是一对一关系
     */
    private User user;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}