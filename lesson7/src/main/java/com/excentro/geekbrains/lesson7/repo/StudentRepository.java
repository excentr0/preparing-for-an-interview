package com.excentro.geekbrains.lesson7.repo;

import com.excentro.geekbrains.lesson7.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {}
