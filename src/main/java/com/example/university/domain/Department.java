package com.example.university.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("DEPARTMENT")
public class Department {
    @Id
    private Integer id;

    private String name;

    private Chair chair;

    public Department(String name, Chair chair) {
        this.name = name;
        this.chair = chair;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Department{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", chair=" + chair +
               '}';
    }
}
