package com.ssm.service;

import com.ssm.po.Chair;
import com.ssm.po.ChairCustom;

import java.util.List;

public interface ChairService {

    List<Chair> queryAllChair() throws Exception;

    ChairCustom queryOneChair(Integer classid) throws Exception;
}
