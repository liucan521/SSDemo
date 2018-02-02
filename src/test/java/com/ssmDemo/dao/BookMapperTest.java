package com.ssmDemo.dao;

import com.ssmDemo.model.Ttraining;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class BookMapperTest {

    @Autowired
    private TtrainingMapper mapper;
    @Test
    public void testSelect() throws Exception{
        Ttraining ttraining = new Ttraining();
        ttraining = mapper.selectByPrimaryKey(12370);
        System.out.println(ttraining.getName() + "--" +ttraining.getIdcard());
    }
    @Test
    public void testInsert() throws Exception {
        Ttraining training = new Ttraining();
        training.setStudentid(123456);
        training.setName("liucan");
        int i=0;
        i = mapper.insert(training);
        if(i>0){
            System.out.println("insert success!");
        }else{
            System.out.println("insert fail!");
        }
    }
    @Test
    public void testUpdate() throws Exception {
        Ttraining training = new Ttraining();
        training.setStudentid(12370);
        training.setWeight((byte)55);
        int i=0;
        i = mapper.updateByPrimaryKeySelective(training);
        if(i>0){
            System.out.println("update success!");
        }else{
            System.out.println("update fail!");
        }
    }


}