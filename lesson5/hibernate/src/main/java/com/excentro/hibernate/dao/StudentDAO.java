package com.excentro.hibernate.dao;

import java.util.List;
import com.excentro.hibernate.entity.Student;

public interface StudentDAO {
  void save(Student student);

  void add(Student student);

  void del(Student student);

  void update(Student student);

  Student getStudent(Long id);

  List<Student> getStudents();

  void closeSession();
}
