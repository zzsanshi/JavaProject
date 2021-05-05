package com.javaclimb.entity;

import lombok.Data;

import java.util.Date;

@Data
public class GoodsType extends PageBean{
    private Integer id;
    private String name;
    private Integer state;
    private Date createTime;
    private Date updateTime;
}
