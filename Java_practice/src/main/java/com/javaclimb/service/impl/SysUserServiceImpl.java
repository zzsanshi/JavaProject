package com.javaclimb.service.impl;

import com.javaclimb.entity.SysUser;
import com.javaclimb.mapper.SysUserMapper;
import com.javaclimb.service.SysUserService;
import com.javaclimb.util.Consts;
import com.javaclimb.util.ReturnData;
import com.javaclimb.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ConcurrentModificationException;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public ReturnData login(SysUser user, HttpServletRequest request) {
        ReturnData returnData = ReturnData.fail("失败");
        if(user == null){
            returnData = ReturnData.fail("非法调用");
        }
        else if(TextUtils.isEmpty(user.getUsername())) {
            returnData = ReturnData.fail("用户名为空");
        }
        else if(TextUtils.isEmpty(user.getPassword())) {
            returnData = ReturnData.fail("用户名为空");
        }
        else {
            SysUser dbUser = sysUserMapper.getByUserName(user.getUsername());
            if (dbUser == null) {
                returnData = ReturnData.fail("用户名不存在");
            } else if (!dbUser.getPassword().equals(user.getPassword())) {
                returnData = ReturnData.fail("密码错误");
            }else {
                request.getSession().setAttribute(Consts.SYS_USER_INFO,dbUser);
                returnData = ReturnData.success("成功");
            }

        }
        return returnData;
    }
}
