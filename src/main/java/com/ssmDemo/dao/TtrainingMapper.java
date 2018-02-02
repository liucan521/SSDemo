package com.ssmDemo.dao;

import com.ssmDemo.model.Ttraining;
import com.ssmDemo.model.TtrainingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TtrainingMapper {
    int countByExample(TtrainingExample example);

    int deleteByExample(TtrainingExample example);

    int deleteByPrimaryKey(Integer studentid);

    int insert(Ttraining record);

    int insertSelective(Ttraining record);

    List<Ttraining> selectByExampleWithBLOBs(TtrainingExample example);

    List<Ttraining> selectByExample(TtrainingExample example);

    Ttraining selectByPrimaryKey(Integer studentid);

    int updateByExampleSelective(@Param("record") Ttraining record, @Param("example") TtrainingExample example);

    int updateByExampleWithBLOBs(@Param("record") Ttraining record, @Param("example") TtrainingExample example);

    int updateByExample(@Param("record") Ttraining record, @Param("example") TtrainingExample example);

    int updateByPrimaryKeySelective(Ttraining record);

    int updateByPrimaryKeyWithBLOBs(Ttraining record);

    int updateByPrimaryKey(Ttraining record);
}