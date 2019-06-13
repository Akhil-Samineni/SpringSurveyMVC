package com.uhcl.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "Survey")
@Component
public class SurveyHibernate {

    @Id
    private String course_id;

    private int user_id;
    private int ta_id;
    private int a_id;
    private int co_id;
    private int f_id;
    private int instructor_id;
    private int o_id;
    private int r_id;
    private int ss_id;

    public String getCourse_id() {
        return course_id;
    }

    public void setCourse_id(String course_id) {
        this.course_id = course_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getTa_id() {
        return ta_id;
    }

    public void setTa_id(int ta_id) {
        this.ta_id = ta_id;
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public int getCo_id() {
        return co_id;
    }

    public void setCo_id(int co_id) {
        this.co_id = co_id;
    }

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public int getInstructor_id() {
        return instructor_id;
    }

    public void setInstructor_id(int instructor_id) {
        this.instructor_id = instructor_id;
    }

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public int getSs_id() {
        return ss_id;
    }

    public void setSs_id(int ss_id) {
        this.ss_id = ss_id;
    }

    @Override
    public String toString() {
        return "SurveyHibernate{" +
                "course_id='" + course_id + '\'' +
                ", user_id=" + user_id +
                ", ta_id=" + ta_id +
                ", a_id=" + a_id +
                ", co_id=" + co_id +
                ", f_id=" + f_id +
                ", instructor_id=" + instructor_id +
                ", o_id=" + o_id +
                ", r_id=" + r_id +
                ", ss_id=" + ss_id +
                '}';
    }
}
