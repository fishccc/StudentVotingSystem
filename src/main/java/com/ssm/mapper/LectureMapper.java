package com.ssm.mapper;

import com.ssm.po.Lecture;
import com.ssm.po.LectureExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LectureMapper {
    int countByExample(LectureExample example);

    int deleteByExample(LectureExample example);

    int deleteByPrimaryKey(Integer lecturerId);

    int insert(Lecture record);

    int insertSelective(Lecture record);

    List<Lecture> selectByExample(LectureExample example);

    Lecture selectByPrimaryKey(Integer lecturerId);

    int updateByExampleSelective(@Param("record") Lecture record, @Param("example") LectureExample example);

    int updateByExample(@Param("record") Lecture record, @Param("example") LectureExample example);

    int updateByPrimaryKeySelective(Lecture record);

    int updateByPrimaryKey(Lecture record);

    Lecture findLectureByUP(@Param("username") String username ,@Param("password") String password);
}