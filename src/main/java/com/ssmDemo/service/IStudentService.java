package com.ssmDemo.service;

import com.ssmDemo.model.Student;

import java.util.List;

public interface IStudentService {

    public int insertStudents(List<Student> records);

    public int insertStudent(Student record);
    public int deleteStudent(int studentid);
}
