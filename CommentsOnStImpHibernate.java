package com.uhcl.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "CommentsOnStImp")
@Component
public class CommentsOnStImpHibernate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int co_id;

    private String q33;
    private String q34;
    private String q35;
    private String q36;

    public int getCo_id() {
        return co_id;
    }

    public void setCo_id(int co_id) {
        this.co_id = co_id;
    }

    public String getQ33() {
        return q33;
    }

    public void setQ33(String q33) {
        this.q33 = q33;
    }

    public String getQ34() {
        return q34;
    }

    public void setQ34(String q34) {
        this.q34 = q34;
    }

    public String getQ35() {
        return q35;
    }

    public void setQ35(String q35) {
        this.q35 = q35;
    }

    public String getQ36() {
        return q36;
    }

    public void setQ36(String q36) {
        this.q36 = q36;
    }

    @Override
    public String toString() {
        return "CommentsOnStImpHibernate{" +
                "co_id=" + co_id +
                ", q33='" + q33 + '\'' +
                ", q34='" + q34 + '\'' +
                ", q35='" + q35 + '\'' +
                ", q36='" + q36 + '\'' +
                '}';
    }
}
