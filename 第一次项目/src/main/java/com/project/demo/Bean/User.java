package com.project.demo.Bean;

import lombok.Data;

@Data
public class User {
    private int USER_ID;             //用户id
    private String USER_ACCOUNT;     //用户账户
    private String USER_PASSWORD;    //用户密码
    private Boolean IS_DELETE;       //逻辑删除

    public int getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(int USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getUSER_ACCOUNT() {
        return USER_ACCOUNT;
    }

    public void setUSER_ACCOUNT(String USER_ACCOUNT) {
        this.USER_ACCOUNT = USER_ACCOUNT;
    }

    public String getUSER_PASSWORD() {
        return USER_PASSWORD;
    }

    public void setUSER_PASSWORD(String USER_PASSWORD) {
        this.USER_PASSWORD = USER_PASSWORD;
    }

    public Boolean getIS_DELETE() {
        return IS_DELETE;
    }

    public void setIS_DELETE(Boolean IS_DELETE) {
        this.IS_DELETE = IS_DELETE;
    }
}


