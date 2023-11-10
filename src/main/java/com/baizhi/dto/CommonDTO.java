package com.baizhi.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class CommonDTO implements Serializable {
    //状态
    private Boolean status;
    //传输的数据
    private Object data;
    //错误信息
    private String message;
}
