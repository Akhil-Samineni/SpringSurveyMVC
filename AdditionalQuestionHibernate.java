package com.uhcl.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="AdditionalQuestion")
@Component
public class AdditionalQuestionHibernate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int a_id;

    private String q20;
    private String q21;
    private String q22;
    private String q23;
    private String q24;
    private String q25;

    @Override
    public String toString() {
        return "AdditionalQuestionHibernate{" +
                "a_id=" + a_id +
                ", q20='" + q20 + '\'' +
                ", q21='" + q21 + '\'' +
                ", q22='" + q22 + '\'' +
                ", q23='" + q23 + '\'' +
                ", q24='" + q24 + '\'' +
                ", q25='" + q25 + '\'' +
                '}';
    }

    public int getA_id() {
        return a_id;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public String getQ20() {
        return q20;
    }

    public void setQ20(String q20) {
        this.q20 = q20;
    }

    public String getQ21() {
        return q21;
    }

    public void setQ21(String q21) {
        this.q21 = q21;
    }

    public String getQ22() {
        return q22;
    }

    public void setQ22(String q22) {
        this.q22 = q22;
    }

    public String getQ23() {
        return q23;
    }

    public void setQ23(String q23) {
        this.q23 = q23;
    }

    public String getQ24() {
        return q24;
    }

    public void setQ24(String q24) {
        this.q24 = q24;
    }

    public String getQ25() {
        return q25;
    }

    public void setQ25(String q25) {
        this.q25 = q25;
    }
}
