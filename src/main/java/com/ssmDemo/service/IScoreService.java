package com.ssmDemo.service;

import com.ssmDemo.model.ScoreModel;

import java.util.List;

public interface IScoreService {
    List<ScoreModel> getScores(int id);
}
