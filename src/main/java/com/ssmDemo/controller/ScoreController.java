package com.ssmDemo.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ssmDemo.model.ScoreModel;
import com.ssmDemo.service.IScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    private IScoreService scoreService;

    @RequestMapping("/getScores.do")
    public void getScores(HttpServletRequest request, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String studentid = request.getParameter("studentid");

        List<ScoreModel> scores = scoreService.getScores(Integer.parseInt(studentid));
        ObjectMapper objectMapper = new ObjectMapper();
        response.getWriter().write(objectMapper.writeValueAsString(scores));
        response.getWriter().close();
    }

}
