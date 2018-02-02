package com.ssmDemo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssmDemo.model.Ttraining;
import com.ssmDemo.service.ITrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/training")
public class TrainingController {
    @Autowired
    private ITrainingService trainingService;

    @RequestMapping("selectByPrimaryKey.do")
    public void selectByPrimaryKey(HttpServletRequest request, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Integer studentid = Integer.parseInt(request.getParameter("studentid"));
        Ttraining ttraining = trainingService.selectByPrimaryKey(studentid);
        ObjectMapper objectMapper = new ObjectMapper();
        response.getWriter().write(objectMapper.writeValueAsString(ttraining));
        response.getWriter().close();
    }

    @RequestMapping("/insertTrainig.do")
    public void insertTrainig(HttpServletRequest request, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd");
        String name = request.getParameter("name");
        String ethnic = request.getParameter("ethnic");
        String idcard = request.getParameter("idcard");
        String bloodtype = request.getParameter("bloodtype");
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");
        String domicile = request.getParameter("domicile");
        String address = request.getParameter("address");
        String political = request.getParameter("political");
        String education = request.getParameter("education");
        String birthday = request.getParameter("birthday");
        String telephone = request.getParameter("telephone");
        Date date = sdf.parse(birthday);
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        Ttraining training = new Ttraining();
        training.setStudentid(Integer.parseInt(idcard.substring(idcard.length()-6,idcard.length())));
        training.setName(name);
        training.setIdcard(idcard);
        training.setEthnic(ethnic);
        training.setEducation(education);
        training.setPolitical(political);
        training.setGender(gender);
        training.setBirthdate(date);
        training.setAddress(address);
        training.setAge(Integer.parseInt(age));
        training.setBloodtype(bloodtype);
        training.setDomicile(domicile);
        training.setTelephone(telephone);
        training.setHeight((byte)Integer.parseInt(height));
        training.setWeight((byte)Integer.parseInt(weight));
        int i=0;
        try {
            i = trainingService.insert(training);
            if(i>0){
                System.out.println("insert success!");
            }else{
                System.out.println("insert fail!");
            }
            response.getWriter().print(i);
        }catch(Exception e){
            response.getWriter().print(0);
        }
    }

    @RequestMapping("/updateTrainig.do")
    public void updateTrainig(HttpServletRequest request, HttpServletResponse response) throws Exception{

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        SimpleDateFormat sdf = new SimpleDateFormat( "yyyy-MM-dd");
        String name = request.getParameter("name");
        String ethnic = request.getParameter("ethnic");
        String idcard = request.getParameter("idcard");
        String bloodtype = request.getParameter("bloodtype");
        String height = request.getParameter("height");
        String weight = request.getParameter("weight");
        String domicile = request.getParameter("domicile");
        String address = request.getParameter("address");
        String political = request.getParameter("political");
        String education = request.getParameter("education");
        String birthday = request.getParameter("birthday");
        String telephone = request.getParameter("telephone");
        Date date = sdf.parse(birthday);
        String age = request.getParameter("age");
        String gender = request.getParameter("gender");
        Ttraining training = new Ttraining();
        training.setStudentid(Integer.parseInt(idcard.substring(idcard.length()-6,idcard.length())));
        training.setName(name);
        training.setIdcard(idcard);
        training.setEthnic(ethnic);
        training.setEducation(education);
        training.setPolitical(political);
        training.setGender(gender);
        training.setBirthdate(date);
        training.setAddress(address);
        training.setAge(Integer.parseInt(age));
        training.setBloodtype(bloodtype);
        training.setDomicile(domicile);
        training.setTelephone(telephone);
        training.setHeight((byte)Integer.parseInt(height));
        training.setWeight((byte)Integer.parseInt(weight));
        int i=0;
        try {
            i = trainingService.updateByPrimaryKey(training);
            if(i>0){
                System.out.println("insert success!");
            }else{
                System.out.println("insert fail!");
            }
            response.getWriter().print(i);
        }catch(Exception e){
            response.getWriter().print(0);
        }

    }
}
