package com.school.lschool.domain.repository;

import com.school.lschool.domain.model.Student;
import com.school.lschool.domain.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    boolean existsByCpf(String cpf);
}
