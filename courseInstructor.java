package com.uhcl.model;

import org.springframework.stereotype.Component;

@Component
public class courseInstructor {
    private String course_id;
    private int instructor_id;
    private int user_id;

    @Override
    public String toString() {
        return "courseInstructor{" +
                "course_id='" + course_id + '\'' +
                ", instructor_id=" + instructor_id +
                '}';
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }
}
