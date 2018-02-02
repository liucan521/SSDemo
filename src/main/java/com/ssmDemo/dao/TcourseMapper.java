package com.ssmDemo.dao;

import com.ssmDemo.model.Tcourse;
import com.ssmDemo.model.TcourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TcourseMapper {
    int countByExample(TcourseExample example);

    int deleteByExample(TcourseExample example);

    int deleteByPrimaryKey(Integer courseid);

    int insert(Tcourse record);

    int insertSelective(Tcourse record);

    List<Tcourse> selectByExample(TcourseExample example);

    Tcourse selectByPrimaryKey(Integer courseid);

    int updateByExampleSelective(@Param("record") Tcourse record, @Param("example") TcourseExample example);

    int updateByExample(@Param("record") Tcourse record, @Param("example") TcourseExample example);

    int updateByPrimaryKeySelective(Tcourse record);

    int updateByPrimaryKey(Tcourse record);
}