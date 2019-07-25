package com.ssm.service.impl;

import com.ssm.mapper.ChairMapper;
import com.ssm.mapper.ChairMapperCustom;
import com.ssm.po.Chair;
import com.ssm.po.ChairCustom;
import com.ssm.service.ChairService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @date 2019-04-05-17-57
 */
public class ChairServiceImpl implements ChairService {
    @Autowired
    private ChairMapper chairMapper;
    @Autowired
    private ChairMapperCustom chairMapperCustom;

    @Override
    public List<Chair> queryAllChair() throws Exception {

        return chairMapper.selectByExample(null);
    }

    @Override
    public ChairCustom queryOneChair(Integer classid) throws Exception {
        return chairMapperCustom.queryOneChair(classid);
    }
}
