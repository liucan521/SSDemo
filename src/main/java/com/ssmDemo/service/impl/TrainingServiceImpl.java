package com.ssmDemo.service.impl;

import com.ssmDemo.dao.TtrainingMapper;
import com.ssmDemo.model.Ttraining;
import com.ssmDemo.service.ITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service("trainingService")
public class TrainingServiceImpl implements ITrainingService {

    @Autowired
    private TtrainingMapper ttrainingMapper;
    @Override
    @Transactional
    public int insert(Ttraining record) throws Exception{
        return ttrainingMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Ttraining record) {
        return ttrainingMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Ttraining selectByPrimaryKey(Integer studentid) {
        return ttrainingMapper.selectByPrimaryKey(studentid);
    }
}
