package com.ssmDemo.service;

import com.ssmDemo.model.Ttraining;

import javax.transaction.Transactional;

public interface ITrainingService {

    public int insert(Ttraining record) throws  Exception;

    public int updateByPrimaryKey(Ttraining record);

    public Ttraining selectByPrimaryKey(Integer studentid);

}
