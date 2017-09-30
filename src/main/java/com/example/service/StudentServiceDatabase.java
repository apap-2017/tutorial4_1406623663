package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentMapper;
import com.example.model.StudentModel;

import lombok.extern.slf4j.Slf4j;

//@Slf4j
@Service
public class StudentServiceDatabase implements StudentService
{
    @Autowired
    private StudentMapper studentMapper;
    
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(StudentServiceDatabase.class);

    @Override
    public StudentModel selectStudent (String npm)
    {
        log.info ("select student with npm {}", npm);
        
        return studentMapper.selectStudent (npm);
    }


    @Override
    public List<StudentModel> selectAllStudents ()
    {
        log.info ("select all students");
        return studentMapper.selectAllStudents ();
    }


    @Override
    public void addStudent (StudentModel student)
    {
        studentMapper.addStudent (student);
    }


	@Override
    public  void deleteStudent (String npm)
    {
    	 	log.info ("student " + npm + "deleted ");
        studentMapper.deleteStudent(npm);
    }

}
