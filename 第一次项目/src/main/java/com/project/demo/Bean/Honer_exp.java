package com.project.demo.Bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Date;

public class Honer_exp {
    private Integer honer_id;
    private Integer honer_user_id;
    @JsonFormat(pattern="yyyy-MM-dd HH-mm-ss",timezone = "GMT+8")
    private Date honer_date;
    private String honer_match;
    private String honer_rank;
    private String honer_url;
    private Integer is_delete;

    public Integer getHoner_id() {
        return honer_id;
    }

    public void setHoner_id(Integer honer_id) {
        this.honer_id = honer_id;
    }

    public Integer getHoner_user_id() {
        return honer_user_id;
    }

    public void setHoner_user_id(Integer honer_user_id) {
        this.honer_user_id = honer_user_id;
    }

    public Date getHoner_date() {
        return honer_date;
    }

    public void setHoner_date(Date honer_date) {
        this.honer_date = honer_date;
    }

    public String getHoner_match() {
        return honer_match;
    }

    public void setHoner_match(String honer_match) {
        this.honer_match = honer_match;
    }

    public String getHoner_rank() {
        return honer_rank;
    }

    public void setHoner_rank(String honer_rank) {
        this.honer_rank = honer_rank;
    }

    public String getHoner_url() {
        return honer_url;
    }

    public void setHoner_url(String honer_url) {
        this.honer_url = honer_url;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

}
