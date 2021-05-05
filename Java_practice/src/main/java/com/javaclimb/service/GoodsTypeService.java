package com.javaclimb.service;

import com.javaclimb.entity.GoodsType;
import com.javaclimb.util.ReturnData;
import com.javaclimb.util.ReturnDataForLayui;

import java.util.List;

public interface GoodsTypeService {
    ReturnDataForLayui getList(GoodsType goodsType);
    ReturnData add(GoodsType goodsType);
    ReturnData delete(GoodsType goodsType);
    ReturnData update(GoodsType goodsType);
    ReturnData updateState(GoodsType goodsType);
}
