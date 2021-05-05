package com.javaclimb.service;

import com.javaclimb.entity.Orders;
import com.javaclimb.util.ReturnData;
import com.javaclimb.util.ReturnDataForLayui;

public interface OrdersService {
    ReturnDataForLayui getList(Orders orders);
    ReturnData add(Orders orders);
    ReturnData delete(Orders orders);
    ReturnData update(Orders orders);
    ReturnData updateState(Orders orders);
}
