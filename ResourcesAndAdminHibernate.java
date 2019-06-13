package com.uhcl.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "ResourcesAndAdmin")
public class ResourcesAndAdminHibernate {
    @Id
    @Column(name = "r_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int r_id;

    @Column(name = "q16")
    private String q16;

    @Column(name = "q17")
    private String q17;

    @Column(name = "q18")
    private String q18;

    @Column(name = "q19")
    private String q19;

    public int getR_id() {
        return r_id;
    }

    public void setR_id(int r_id) {
        this.r_id = r_id;
    }

    public String getQ16() {
        return q16;
    }

    public void setQ16(String q16) {
        this.q16 = q16;
    }

    public String getQ17() {
        return q17;
    }

    public void setQ17(String q17) {
        this.q17 = q17;
    }

    public String getQ18() {
        return q18;
    }

    public void setQ18(String q18) {
        this.q18 = q18;
    }

    public String getQ19() {
        return q19;
    }

    public void setQ19(String q19) {
        this.q19 = q19;
    }

    @Override
    public String toString() {
        return "ResourcesAndAdminHibernate{" +
                "r_id=" + r_id +
                ", q16='" + q16 + '\'' +
                ", q17='" + q17 + '\'' +
                ", q18='" + q18 + '\'' +
                ", q19='" + q19 + '\'' +
                '}';
    }
}
