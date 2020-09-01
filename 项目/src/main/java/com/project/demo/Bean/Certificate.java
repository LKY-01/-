package com.project.demo.Bean;

public class Certificate {
    private int cert_id;
    private int cret_user_id;
    private String cret_type;
    private String cert_name;
    private String cert_img;
    private int is_delete;

    public int getCert_id() {
        return cert_id;
    }

    public void setCert_id(int cert_id) {
        this.cert_id = cert_id;
    }

    public int getCret_user_id() {
        return cret_user_id;
    }

    public void setCret_user_id(int cret_user_id) {
        this.cret_user_id = cret_user_id;
    }

    public String getCret_type() {
        return cret_type;
    }

    public void setCret_type(String cret_type) {
        this.cret_type = cret_type;
    }

    public String getCert_name() {
        return cert_name;
    }

    public void setCert_name(String cert_name) {
        this.cert_name = cert_name;
    }

    public String getCert_img() {
        return cert_img;
    }

    public void setCert_img(String cert_img) {
        this.cert_img = cert_img;
    }

    public int getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(int is_delete) {
        this.is_delete = is_delete;
    }
}
