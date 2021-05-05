package com.javaclimb.util.filter;

import com.javaclimb.util.Consts;
import com.javaclimb.util.ReturnData;
import com.javaclimb.util.TextUtils;
import com.sun.xml.bind.v2.runtime.reflect.opt.Const;
import org.elasticsearch.action.admin.cluster.snapshots.status.TransportNodesSnapshotsStatus;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyWebFilter extends GenericFilterBean {
    public static final String FROM_MICRO = "micro";
    public static final String USER_TYPE_NORMAL = "userTypeNormal";

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = ((HttpServletRequest) servletRequest);
        HttpServletResponse resp = ((HttpServletResponse) servletResponse);
        System.out.println(req.getRequestURI());

        List<String> urlIgnorelist = new ArrayList<String>();
        urlIgnorelist.add("/resources");
        urlIgnorelist.add("/upload");
        urlIgnorelist.add("/requestLogin");
        urlIgnorelist.add("/user/getUserByCode");
        urlIgnorelist.add("/adverisement/getList");
        urlIgnorelist.add("/goods/getList");
        urlIgnorelist.add("/goodsType/getList");
        urlIgnorelist.add("/login");
        urlIgnorelist.add("/regist");
        urlIgnorelist.add("/logout");

        boolean isNeedDealwith = true;
        for (String path :urlIgnorelist) {
            if (req.getServletPath().contains(path)) {
                isNeedDealwith = false;
                break;
            }
        }
        try {
            //判断用户的请求资源
            String from = req.getHeader("from");
            if (TextUtils.isEmpty(from)){
                //web端
                if (isNeedDealwith) {
                    //判断用户是否登录
                    HttpSession session = req.getSession();
                    Object o = session.getAttribute(Consts.SYS_USER_INFO);
                    if (o == null) {
                        resp.sendRedirect(req.getContextPath() + "/login");
                    }
                    else {
                        //重新设置
                        session.setAttribute(Consts.SYS_USER_INFO, o);
                    }
                }
                filterChain.doFilter(req,resp);
            }else if (FROM_MICRO.equals(from)) {
                //与移动端登录
                resp.setCharacterEncoding("utf-8");
                resp.setContentType("application/json; charset=utf-8");
                if (!isNeedDealwith) {
                    filterChain.doFilter(req,resp);
                    return;
                }
                String token = req.getHeader("token");
                if (TextUtils.isEmpty(token)) {
                    makeResponse(resp, ReturnData.fail("请携带token"));
                    return;
                }
                ReturnData returnData = JwtUtil.valid(token);
                if (returnData.getCode()!= 200) {
                    makeResponse(resp, returnData);
                    return;
                }
                Long id = (Long) returnData.getData();
                if (id == null) {
                    makeResponse(resp,ReturnData.fail("token有错误"));
                    return;
                }
                RequestParameterWrapper requestParameterWrapper = new RequestParameterWrapper();
                Map<String,Object> param = new HashMap<>();

            }
        }
        catch (){
            System.out.println("11");
        }
    }
}
