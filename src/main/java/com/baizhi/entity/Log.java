package com.baizhi.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName yx_log
 */
@TableName(value ="yx_log")
@Data
public class Log implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 管理员用户名
     */
    @TableField(value = "admin_name")
    private String adminName;

    /**
     * 操作时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 操作方法名
     */
    @TableField(value = "method_name")
    private String methodName;

    /**
     * 操作是否成功
     */
    @TableField(value = "option_status")
    private Boolean optionStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}