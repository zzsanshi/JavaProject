package com.javaclimb.service;

import com.javaclimb.entity.SysUser;
import com.javaclimb.util.ReturnData;

import javax.servlet.http.HttpServletRequest;

//管理员管理service接口
public interface SysUserService {
    //登录判断
    public ReturnData login(SysUser user, HttpServletRequest request);
}
