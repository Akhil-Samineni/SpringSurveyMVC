package com.uhcl.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="Instructor")
@Component
public class InstructorHibernate {
    @Id
    @Column(name = "instructor_id")
    private int instructor_id;

    @Column(name = "instFullName")
    private String instFullName;

    @Column(name = "instLastName")
    private String instLastName;

    @Column(name = "title")
    private String title;


    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public String getInstFullName() {
        return instFullName;
    }

    public void setInstFullName(String instFullName) {
        this.instFullName = instFullName;
    }

    public String getInstLastName() {
        return instLastName;
    }

    public void setInstLastName(String instLastName) {
        this.instLastName = instLastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "InstructorHibernate{" +
                "instructor_id=" + instructor_id +
                ", instFullName='" + instFullName + '\'' +
                ", instLastName='" + instLastName + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
