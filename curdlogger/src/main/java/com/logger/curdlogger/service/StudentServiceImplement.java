package com.logger.curdlogger.service;

import com.logger.curdlogger.entity.Student;
import com.logger.curdlogger.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplement implements StudentService {

  @Autowired
  StudentRepo studentRepo;
  @Override
  public List<Student> getAllStudent() {
    return studentRepo.findAll();
  }

  @Override
  public Student saveStudent(Student student) {
    return studentRepo.save(student);
  }

  @Override
  public void deleteStudent(Long ID) {
      studentRepo.deleteById(ID);
  }

  @Override
  public void updateStudent(Long Id, Student student) {
    Student st = studentRepo.findById(Id).get();
      studentRepo.save(st);
  }

  @Override
  public Student getStudentId(Long Id) {
    return studentRepo.findById(Id).get();
  }
}
