package com.school.lschool.domain.repository;

import com.school.lschool.domain.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject,Long> {
    boolean existsByName(String name);
}
