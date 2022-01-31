package com.logger.curdlogger.service;

import com.logger.curdlogger.entity.Student;

import java.util.List;

public interface StudentService {

  public List<Student> getAllStudent();

  public Student saveStudent(Student student);

  public void deleteStudent(Long ID);

  public void updateStudent(Long Id,Student student);

  public Student getStudentId(Long Id);
}
