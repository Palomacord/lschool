package com.school.lschool.service.impl;

import com.school.lschool.domain.repository.SubjectRepository;
import com.school.lschool.service.SubjectService;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;
import java.util.Optional;

@Service
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Optional<com.school.lschool.domain.model.Subject> findById(Long id) {
        return subjectRepository.findById(id);
    }

    @Override
    public Subject findByName(String name) {
        return null;
    }

    @Override
    public Subject createSubject(Subject userToCreate) {
        return null;
    }
}
