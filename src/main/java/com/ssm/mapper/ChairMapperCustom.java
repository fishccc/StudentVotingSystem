package com.ssm.mapper;

import com.ssm.po.ChairCustom;
import org.apache.ibatis.annotations.Param;

public interface ChairMapperCustom {
    ChairCustom queryOneChair(@Param("classid") Integer classid) throws Exception;
}
