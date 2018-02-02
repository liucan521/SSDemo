package com.ssmDemo.dao;

import com.ssmDemo.model.Student;
import com.ssmDemo.service.IStudentService;
import com.ssmDemo.service.impl.StudentServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class StudentTest {

    @Autowired
    private IStudentService studentService;
    @Test
    public void testInsertStudents(){
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student();
        student1.setId(301);
        students.add(student1);

        Student student2 = new Student();
        student2.setId(302);
        students.add(student2);

        Student student3 = new Student();
        student3.setId(303);
        students.add(student3);

        Student student4 = new Student();
        student4.setId(304);
        students.add(student4);

        studentService.insertStudents(students);
    }

    @Test
    public void testInsertStudent(){

        Student student1 = new Student();
        student1.setId(401);

        studentService.insertStudent(student1);
    }

}
