package com.uhcl.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "Course")
public class CourseHibernate {
    @Id
    @Column(name = "course_id")
    private String course_id;

    @Column(name = "courseTitle")
    private String courseTitle;

    @Column(name = "credit")
    private String credit;

    @Column(name = "semester")
    private String semester;


    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "CourseHibernate{" +
                "course_id='" + course_id + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                ", credit='" + credit + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
