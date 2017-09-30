package com.example.service;

import java.util.List;

import com.example.model.StudentModel;

public interface StudentService
{
    StudentModel selectStudent (String npm);


    List<StudentModel> selectAllStudents ();


    void addStudent (StudentModel student);


	void deleteStudent(String npm);


   // void StudentModel deleteStudent (String npm);
    
}
