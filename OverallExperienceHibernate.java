package com.uhcl.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "OverallExperience")
@Component
public class OverallExperienceHibernate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int o_id;

    private String q26;
    private String q27;
    private String q28;
    private String q29;

    public int getO_id() {
        return o_id;
    }

    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    public String getQ26() {
        return q26;
    }

    public void setQ26(String q26) {
        this.q26 = q26;
    }

    public String getQ27() {
        return q27;
    }

    public void setQ27(String q27) {
        this.q27 = q27;
    }

    public String getQ28() {
        return q28;
    }

    public void setQ28(String q28) {
        this.q28 = q28;
    }

    public String getQ29() {
        return q29;
    }

    public void setQ29(String q29) {
        this.q29 = q29;
    }

    @Override
    public String toString() {
        return "OverallExperienceHibernate{" +
                "o_id=" + o_id +
                ", q26='" + q26 + '\'' +
                ", q27='" + q27 + '\'' +
                ", q28='" + q28 + '\'' +
                ", q29='" + q29 + '\'' +
                '}';
    }
}
