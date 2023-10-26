package com.school.lschool.domain.repository;

import com.school.lschool.domain.model.Student;
import com.school.lschool.domain.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
    boolean existsByCpf(String cpf);
}
