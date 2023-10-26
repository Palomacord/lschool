package com.school.lschool.domain.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity(name = "tb_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Subject> subjects;

    public List<Subject> getNews() {
        return subjects;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.birthDate = dataNascimento;
    }


}
