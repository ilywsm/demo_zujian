package com.liuxu.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_class")
public class Classs {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer  id;
        private String classname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
