package com.project.demo.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class Project_exp {
    private Integer project_exp_id;
    private Integer project_exp_user_id;
    private String project_exp_name;
    private String project_exp_role;
    private String project_exp_url;
    @JsonFormat(pattern="yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private Date Pproject_exp_begin;
    @JsonFormat(pattern="yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private Date project_exp_end;
    private String project_exp_descripbe;
    private Integer is_delete;

    public String getProject_exp_role() {
        return project_exp_role;
    }

    public void setProject_exp_role(String project_exp_role) {
        this.project_exp_role = project_exp_role;
    }

    public Integer getProject_exp_id() {
        return project_exp_id;
    }

    public void setProject_exp_id(Integer project_exp_id) {
        this.project_exp_id = project_exp_id;
    }

    public Integer getProject_exp_user_id() {
        return project_exp_user_id;
    }

    public void setProject_exp_user_id(Integer project_exp_user_id) {
        this.project_exp_user_id = project_exp_user_id;
    }

    public String getProject_exp_name() {
        return project_exp_name;
    }

    public void setProject_exp_name(String project_exp_name) {
        this.project_exp_name = project_exp_name;
    }


    public String getProject_exp_url() {
        return project_exp_url;
    }

    public void setProject_exp_url(String project_exp_url) {
        this.project_exp_url = project_exp_url;
    }

    public Date getPproject_exp_begin() {
        return Pproject_exp_begin;
    }

    public void setPproject_exp_begin(Date pproject_exp_begin) {
        Pproject_exp_begin = pproject_exp_begin;
    }

    public Date getProject_exp_end() {
        return project_exp_end;
    }

    public void setProject_exp_end(Date project_exp_end) {
        this.project_exp_end = project_exp_end;
    }

    public String getProject_exp_descripbe() {
        return project_exp_descripbe;
    }

    public void setProject_exp_descripbe(String project_exp_descripbe) {
        this.project_exp_descripbe = project_exp_descripbe;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
