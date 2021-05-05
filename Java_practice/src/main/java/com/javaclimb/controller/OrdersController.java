package com.javaclimb.controller;

import com.javaclimb.entity.Orders;
import com.javaclimb.service.OrdersService;
import com.javaclimb.util.ReturnData;
import com.javaclimb.util.ReturnDataForLayui;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @RequestMapping("/listPage")
    public String listPage(){
        return "orders/list";
    }

    @RequestMapping("/getlist")
    public ReturnDataForLayui  getList(Orders orders){
        return ordersService.getList(orders);
    }

    @RequestMapping("/addPage")
    public  String addPage() {
        return "orders/add";
    }

    @RequestMapping("/add")
    @ResponseBody
    public ReturnData add(Orders orders) {
        return ordersService.add(orders);
    }

    @RequestMapping("/editPage")
    public  String editPage() {
        return "orders/edit";
    }

    @RequestMapping("/update")
    @ResponseBody
    public  ReturnData update(Orders orders) {
        return ordersService.update(orders);
    }

    @RequestMapping("/updateState")
    @ResponseBody
    public  ReturnData updateState(Orders orders) {
        return ordersService.updateState(orders);
    }

}
