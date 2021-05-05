package com.javaclimb.entity;

import lombok.Data;
import net.sf.jsqlparser.statement.select.Pivot;

//图书
@Data
public class Goods extends PageBean {
    private Integer id;
    private String name;
    private String des;//简介

}
