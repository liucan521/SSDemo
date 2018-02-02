package com.ssmDemo.dao;

import com.ssmDemo.model.ScoreModel;
import com.ssmDemo.service.impl.ScoreServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class ScoreTest {

    @Autowired
    private ScoreServiceImpl scoreDto;
    @Test
    public void testGetScores(){
        List<ScoreModel> scoreModels = scoreDto.getScores(12370);
        System.out.println(scoreModels.size());
        for(int i = 0;i<scoreModels.size();i++){
            System.out.println("Course:"+scoreModels.get(i).getCoursename());
            System.out.println("Score:"+scoreModels.get(i).getScore());
            System.out.println("-------------");
        }
    }
}
