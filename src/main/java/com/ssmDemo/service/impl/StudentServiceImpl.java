package com.ssmDemo.service.impl;

import com.ssmDemo.dao.StudentMapper;
import com.ssmDemo.model.Student;
import com.ssmDemo.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service("studentService")
public class StudentServiceImpl implements IStudentService{

    @Autowired
    private StudentMapper studentMapper;

    @Transactional
    @Override
    public int insertStudents(List<Student> records) {
        int isSuccess = 0;
        for(int i=0;i<records.size();i++){
            if(i<2) {
                studentMapper.insert(records.get(i));
            }
            else{
                //throw new RuntimeException();
            }
        }
        return isSuccess;
    }

    @Override
    public int insertStudent(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int deleteStudent(int studentid) {
        return studentMapper.deleteByPrimaryKey(studentid);
    }
}
