package com.javaclimb.entity;

import com.github.pagehelper.PageHelper;
import lombok.Data;

import java.util.Date;

@Data
public class SysUser extends PageBean {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer sex;
    private Date createTime;
    private Date updateTime;



}
