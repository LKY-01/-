package com.project.demo.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class Edu_exp {
    private Integer edu_exp_id;
    private Integer edu_exp_user_id;
    private String edu_exp_school_name;
    private String edu_exp_degree;
    private String edu_exp_major;
    @JsonFormat(pattern="yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private Date edu_exp_begin;
    @JsonFormat(pattern="yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private Date edu_exp_end;
    private int is_delete;

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }

    public Integer getEdu_exp_id() {
        return edu_exp_id;
    }

    public void setEdu_exp_id(Integer edu_exp_id) {
        this.edu_exp_id = edu_exp_id;
    }

    public Integer getEdu_exp_user_id() {
        return edu_exp_user_id;
    }

    public void setEdu_exp_user_id(Integer edu_exp_user_id) {
        this.edu_exp_user_id = edu_exp_user_id;
    }

    public String getEdu_exp_school_name() {
        return edu_exp_school_name;
    }

    public void setEdu_exp_school_name(String edu_exp_school_name) {
        this.edu_exp_school_name = edu_exp_school_name;
    }

    public String getEdu_exp_degree() {
        return edu_exp_degree;
    }

    public void setEdu_exp_degree(String edu_exp_degree) {
        this.edu_exp_degree = edu_exp_degree;
    }

    public String getEdu_exp_major() {
        return edu_exp_major;
    }

    public void setEdu_exp_major(String edu_exp_major) {
        this.edu_exp_major = edu_exp_major;
    }

    public Date getEdu_exp_begin() {
        return edu_exp_begin;
    }

    public void setEdu_exp_begin(Date edu_exp_begin) {
        this.edu_exp_begin = edu_exp_begin;
    }

    public Date getEdu_exp_end() {
        return edu_exp_end;
    }

    public void setEdu_exp_end(Date edu_exp_end) {
        this.edu_exp_end = edu_exp_end;
    }


}


