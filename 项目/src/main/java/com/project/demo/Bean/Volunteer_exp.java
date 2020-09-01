package com.project.demo.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class Volunteer_exp {
    private Integer volu_id;
    private Integer volu_user_id;
    private String volu_name;
    private Integer volu_time;
    @JsonFormat(pattern="yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private Date volu_begin;
    @JsonFormat(pattern="yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private Date volu_end;
    private String volu_describe;
    private Integer is_delete;

    public Integer getVolu_id() {
        return volu_id;
    }

    public void setVolu_id(Integer volu_id) {
        this.volu_id = volu_id;
    }

    public Integer getVolu_user_id() {
        return volu_user_id;
    }

    public void setVolu_user_id(Integer volu_user_id) {
        this.volu_user_id = volu_user_id;
    }

    public String getVolu_name() {
        return volu_name;
    }

    public void setVolu_name(String volu_name) {
        this.volu_name = volu_name;
    }

    public Integer getVolu_time() {
        return volu_time;
    }

    public void setVolu_time(Integer volu_time) {
        this.volu_time = volu_time;
    }

    public Date getVolu_begin() {
        return volu_begin;
    }

    public void setVolu_begin(Date volu_begin) {
        this.volu_begin = volu_begin;
    }

    public Date getVolu_end() {
        return volu_end;
    }

    public void setVolu_end(Date volu_end) {
        this.volu_end = volu_end;
    }

    public String getVolu_describe() {
        return volu_describe;
    }

    public void setVolu_describe(String volu_describe) {
        this.volu_describe = volu_describe;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }


}
