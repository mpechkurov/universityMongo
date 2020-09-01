package com.example.university.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Department")
public class Department {
    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @OneToOne
    private Staff chair;

    @OneToMany(fetch = FetchType.EAGER,
               mappedBy = "department",
               cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();

    public Department(String name, Staff chair) {
        this.name = name;
        this.chair = chair;
    }

    protected Department() {
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

    public Staff getChair() {
        return chair;
    }

    public void setChair(Staff chair) {
        this.chair = chair;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
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
