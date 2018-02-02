package com.ssmDemo.dao;

import com.ssmDemo.model.ScoreModel;

import java.util.List;

public interface ScoreDto {

    List<ScoreModel> getScores(int id);
}
