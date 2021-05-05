package com.javaclimb.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javaclimb.entity.Orders;
import com.javaclimb.mapper.OrdersMapper;
import com.javaclimb.mapper.OrdersMapper;
import com.javaclimb.service.OrdersService;
import com.javaclimb.service.OrdersService;
import com.javaclimb.util.ReturnData;
import com.javaclimb.util.ReturnDataForLayui;
import com.javaclimb.util.UpdateOrInsertResultDeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    @Override
    public ReturnDataForLayui getList(Orders orders) {
        PageHelper.startPage(orders.getPage(),orders.getLimit());
        List<Orders> list = ordersMapper.getList(orders);
        PageInfo<Orders> info = new PageInfo<>();
        return ReturnDataForLayui.success(list,info.getTotal());
    }
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public ReturnData add(Orders orders) {
        int i = ordersMapper.add(orders);
        return UpdateOrInsertResultDeal.dealwith(i);
    }
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    @Override
    public ReturnData delete(Orders orders) {
        int i = ordersMapper.delete(orders);
        return UpdateOrInsertResultDeal.dealwith(i);
    }

    @Override
    public ReturnData update(Orders orders) {
        return null;
    }

    @Override
    public ReturnData updateState(Orders orders) {
        return null;
    }
 }
