package com.baizhi.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName yx_category
 */
@TableName(value ="yx_category")
@Data
public class Category implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类别名
     */
    @TableField(value = "cate_name")
    private String cateName;

    /**
     * 级别
     */
    @TableField(value = "levels")
    private Integer levels;

    /**
     * 上级别id
     */
    @TableField(value = "parent_id")
    private Integer parentId;

    /**
     * 逻辑删除
     */
    @TableLogic(value = "is_delete")
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}