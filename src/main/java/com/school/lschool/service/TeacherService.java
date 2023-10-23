package com.school.lschool.service;


import com.school.lschool.domain.model.Student;
import com.school.lschool.domain.model.Teacher;

import java.util.Optional;

public interface TeacherService {

    Optional<Teacher> findById(Long id);
    Teacher findByName(String name);

    Teacher createTeacher(Teacher userToCreate);
}
