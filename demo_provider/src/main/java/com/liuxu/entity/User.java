package com.liuxu.entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date birthday;
        private String pic;

        public String getPic() {
                return pic;
        }

        public void setPic(String pic) {
                this.pic = pic;
        }

        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "classid",referencedColumnName = "id",insertable = false,updatable = false)
        private Classs classs;
        private Integer classid;
        public Integer getClassid() {
                return classid;
        }

        public void setClassid(Integer classid) {
                this.classid = classid;
        }

        public Classs getClasss() {
                return classs;
        }

        public void setClasss(Classs classs) {
                this.classs = classs;
        }

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

        @Override
        public String toString() {
                return "User{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", age=" + age +
                        ", birthday=" + birthday +
                        ", classs=" + classs +
                        '}';
        }
}
