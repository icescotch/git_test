package com.baizhi.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

//该dto适用于分页数据，封装好数据后，将PageDTO封装至CommonDTO的data
@Data
public class PageDTO implements Serializable {
    //每页的数据
    private List result;
    //数据总条数
    private Long total;
}
