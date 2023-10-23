package com.school.lschool.service;


import javax.security.auth.Subject;
import java.util.Optional;

public interface SubjectService {

    Optional<com.school.lschool.domain.model.Subject> findById(Long id);
    Subject findByName(String name);

    Subject createSubject(Subject userToCreate);

}
