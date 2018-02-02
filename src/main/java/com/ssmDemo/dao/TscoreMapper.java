package com.ssmDemo.dao;

import com.ssmDemo.model.Tscore;
import com.ssmDemo.model.TscoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TscoreMapper {
    int countByExample(TscoreExample example);

    int deleteByExample(TscoreExample example);

    int deleteByPrimaryKey(Integer scoreid);

    int insert(Tscore record);

    int insertSelective(Tscore record);

    List<Tscore> selectByExample(TscoreExample example);

    Tscore selectByPrimaryKey(Integer scoreid);

    int updateByExampleSelective(@Param("record") Tscore record, @Param("example") TscoreExample example);

    int updateByExample(@Param("record") Tscore record, @Param("example") TscoreExample example);

    int updateByPrimaryKeySelective(Tscore record);

    int updateByPrimaryKey(Tscore record);


}