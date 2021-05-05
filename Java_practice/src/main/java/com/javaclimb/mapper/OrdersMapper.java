package com.javaclimb.mapper;

import com.javaclimb.entity.Orders;


import java.util.List;

public interface OrdersMapper {
    List<Orders> getList(Orders orders);
    int add(Orders orders);
    int delete(Orders orders);
    int update(Orders orders);
    int updateState(Orders orders);
}
