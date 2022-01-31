package com.logger.curdlogger.repository;

import com.logger.curdlogger.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Long > {
}
