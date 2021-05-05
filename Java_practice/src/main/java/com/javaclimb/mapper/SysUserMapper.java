package com.javaclimb.mapper;

import com.javaclimb.entity.SysUser;

public interface SysUserMapper {
//    根据登陆名查询实体
    public SysUser getByUserName(String username);

}
