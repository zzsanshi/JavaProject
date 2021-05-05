package com.javaclimb.mapper;

import com.javaclimb.entity.Advertisement;
import com.javaclimb.entity.Advertisement;

import java.util.List;

public interface AdvertisementMapper {
    List<Advertisement> getList(Advertisement advertisement);
    int add(Advertisement advertisement);
    int delete(Advertisement advertisement);
    int update(Advertisement advertisement);
    int updateState(Advertisement advertisement);
}
