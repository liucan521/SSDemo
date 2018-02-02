package com.ssmDemo.service.impl;

import com.ssmDemo.dao.ScoreDto;
import com.ssmDemo.model.ScoreModel;
import com.ssmDemo.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("scoreService")
public class ScoreServiceImpl implements IScoreService {
    @Autowired
    private ScoreDto scoreDto;
    @Override
    public List<ScoreModel> getScores(int id) {
        return scoreDto.getScores(id);
    }
}
