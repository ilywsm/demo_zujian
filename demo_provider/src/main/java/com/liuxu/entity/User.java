package com.liuxu.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_user")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private  Integer id;
        private  String name;
        private  Integer age;
        private Date birthday;
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "classid",referencedColumnName = "id",insertable = false,updatable = false)
        private Classs classs;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public Integer getAge() {
                return age;
        }

        public void setAge(Integer age) {
                this.age = age;
        }

        public Date getBirthday() {
                return birthday;
        }

        public void setBirthday(Date birthday) {
                this.birthday = birthday;
        }
}
