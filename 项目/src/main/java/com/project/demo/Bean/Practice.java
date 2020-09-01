package com.project.demo.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class Practice {
    private Integer practice_id;
    private Integer practice_user_id;
    private String practice_company;
    private String practice_position;
    @JsonFormat(pattern="yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private Date practice_begin;
    @JsonFormat(pattern="yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private Date practice_end;
    private String practice_content;
    private Integer is_delete;

    public Integer getPractice_id() {
        return practice_id;
    }

    public void setPractice_id(Integer practice_id) {
        this.practice_id = practice_id;
    }

    public Integer getPractice_user_id() {
        return practice_user_id;
    }

    public void setPractice_user_id(Integer practice_user_id) {
        this.practice_user_id = practice_user_id;
    }

    public String getPractice_company() {
        return practice_company;
    }

    public void setPractice_company(String practice_company) {
        this.practice_company = practice_company;
    }

    public String getPractice_position() {
        return practice_position;
    }

    public void setPractice_position(String practice_position) {
        this.practice_position = practice_position;
    }

    public Date getPractice_begin() {
        return practice_begin;
    }

    public void setPractice_begin(Date practice_begin) {
        this.practice_begin = practice_begin;
    }

    public Date getPractice_end() {
        return practice_end;
    }

    public void setPractice_end(Date practice_end) {
        this.practice_end = practice_end;
    }

    public String getPractice_content() {
        return practice_content;
    }

    public void setPractice_content(String practice_content) {
        this.practice_content = practice_content;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
