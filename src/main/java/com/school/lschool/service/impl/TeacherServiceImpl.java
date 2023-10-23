package com.school.lschool.service.impl;

import com.school.lschool.domain.model.Teacher;
import com.school.lschool.domain.repository.TeacherRepository;
import com.school.lschool.service.TeacherService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Optional<Teacher> findById(Long id) {
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findByName(String name) {
        return null;
    }

    @Override
    public Teacher createTeacher(Teacher userToCreate) {
        if (teacherRepository.existsByCpf(userToCreate.getCpf())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return teacherRepository.save(userToCreate);
    }

}
