package com.javaclimb.service;

import com.javaclimb.entity.Advertisement;
import com.javaclimb.util.ReturnData;
import com.javaclimb.util.ReturnDataForLayui;

public interface AdvertisementService {
    ReturnDataForLayui getList(Advertisement advertisement);
    ReturnData add(Advertisement advertisement);
    ReturnData delete(Advertisement advertisement);
    ReturnData update(Advertisement advertisement);
    ReturnData updateState(Advertisement advertisement);
}
