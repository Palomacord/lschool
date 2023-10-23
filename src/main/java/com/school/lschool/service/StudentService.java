package com.school.lschool.service;

import com.school.lschool.domain.model.Student;

import java.util.Optional;

public interface StudentService {

    Optional<Student> findById(Long id);
    Student findByName(String name);

    Student createStudent(Student userToCreate);
}
