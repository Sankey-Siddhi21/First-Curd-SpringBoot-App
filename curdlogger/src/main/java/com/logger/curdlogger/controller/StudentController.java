package com.logger.curdlogger.controller;

import com.logger.curdlogger.entity.Student;
import com.logger.curdlogger.service.StudentServiceImplement;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Slf4j
@RestController
public class StudentController {

  private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

  @Autowired
  StudentServiceImplement studentServiceImplement;

  @PostMapping("/saveStudent")
  public Student SaveStudentData(@RequestBody Student student){
    logger.info("Data of Student post method");
    return studentServiceImplement.saveStudent(student);
  }

  @GetMapping("/allStudent")
  public List<Student> allStudentData() {
      logger.trace("We are on GetMapping of Student ");
      return studentServiceImplement.getAllStudent();
  }

  @DeleteMapping("/deleteStudent/{Id}")
  public void deleteStudentById(@PathVariable Long Id){
    try {
      logger.trace("We are on Delete Student by Id ");
      studentServiceImplement.deleteStudent(Id);
    } catch (Exception e) {
      logger.error("Enter Valid Path" + e);
    }
  }

  @PutMapping("/Student/{Id}")
  public Student updateStudentData(@PathVariable Long Id,@RequestBody Student student){
    logger.info("We are in PostMapping of Student");
    studentServiceImplement.updateStudent(Id,student);
    return studentServiceImplement.getStudentId(Id);

  }


}
