package com.uhcl.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "StudentSelfEval")
@Component
public class StudentSelfEvalHibernate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ss_id;

    private String q30;
    private String q31;
    private String q32;

    public int getSs_id() {
        return ss_id;
    }

    public void setSs_id(int ss_id) {
        this.ss_id = ss_id;
    }

    public String getQ30() {
        return q30;
    }

    public void setQ30(String q30) {
        this.q30 = q30;
    }

    public String getQ31() {
        return q31;
    }

    public void setQ31(String q31) {
        this.q31 = q31;
    }

    public String getQ32() {
        return q32;
    }

    public void setQ32(String q32) {
        this.q32 = q32;
    }

    @Override
    public String toString() {
        return "StudentSelfEvalHibernate{" +
                "ss_id=" + ss_id +
                ", q30='" + q30 + '\'' +
                ", q31='" + q31 + '\'' +
                ", q32='" + q32 + '\'' +
                '}';
    }
}
