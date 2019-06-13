package com.uhcl.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "FeedbackAndAssessment")
public class FeedbackAndAssessmentHibernate {

    @Id
    @Column(name = "f_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int f_id;

    @Column(name = "q12")
    private String q12;

    @Column(name = "q13")
    private String q13;

    @Column(name = "q14")
    private String q14;

    @Column(name = "q15")
    private String q15;

    public int getF_id() {
        return f_id;
    }

    public void setF_id(int f_id) {
        this.f_id = f_id;
    }

    public String getQ12() {
        return q12;
    }

    public void setQ12(String q12) {
        this.q12 = q12;
    }

    public String getQ13() {
        return q13;
    }

    public void setQ13(String q13) {
        this.q13 = q13;
    }

    public String getQ14() {
        return q14;
    }

    public void setQ14(String q14) {
        this.q14 = q14;
    }

    public String getQ15() {
        return q15;
    }

    public void setQ15(String q15) {
        this.q15 = q15;
    }

    @Override
    public String toString() {
        return "FeedbackAndAssessmentHibernate{" +
                "f_id=" + f_id +
                ", q12='" + q12 + '\'' +
                ", q13='" + q13 + '\'' +
                ", q14='" + q14 + '\'' +
                ", q15='" + q15 + '\'' +
                '}';
    }
}
