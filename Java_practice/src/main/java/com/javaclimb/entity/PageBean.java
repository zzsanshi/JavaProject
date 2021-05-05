package com.javaclimb.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PageBean implements Serializable {
    private Integer page;
    private Integer limit;
}
