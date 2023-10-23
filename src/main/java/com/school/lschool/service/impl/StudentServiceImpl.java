package com.school.lschool.service.impl;

import com.school.lschool.domain.model.Student;
import com.school.lschool.domain.repository.StudentRepository;
import com.school.lschool.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Optional<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student findByName(String name) {
        return null;
    }


    @Override
    public Student createStudent(Student userToCreate) {
        if (studentRepository.existsByCpf(userToCreate.getCpf())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return studentRepository.save(userToCreate);
    }
}
