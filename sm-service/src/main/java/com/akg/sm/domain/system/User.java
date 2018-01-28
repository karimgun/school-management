package com.akg.sm.domain.system;

import com.akg.sm.util.StringUtil;

import javax.persistence.*;


@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;

    @Column
    private String userName;

    @Column
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validateUser(String userName, String password) {
        userName = StringUtil.killWS(userName);
        password = StringUtil.killWS(password);
        if (userName == null || password == null) return false;

        if (this.userName.equals(userName)
                && this.password.equals(password)) {
            return true;
        }
        return false;
    }
}
