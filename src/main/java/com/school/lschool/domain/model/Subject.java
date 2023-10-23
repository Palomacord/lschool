package com.school.lschool.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String type;
    @OneToOne(cascade = CascadeType.ALL)
    private Teacher teacher;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }
}
