package com.liuxu.vo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserVo {
        private  Integer sid;
        private String sname;
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private Date StartDate;
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        private  Date endDate;
        private  Integer age;
        private  Integer cl;

    public Integer getSid() {
        return sid;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCl() {
        return cl;
    }

    public void setCl(Integer cl) {
        this.cl = cl;
    }
}
