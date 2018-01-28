package com.akg.sm.domain.system;

import com.akg.sm.util.StringUtil;

import javax.persistence.*;


@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;


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

//    public UserType getUserType() {
//        return userType;
//    }
//
//    public void setUserType(UserType userType) {
//        this.userType = userType;
//    }
//
//    public Preferences getPreferences() {
//        return preferences;
//    }
//
//    public void setPreferences(Preferences preferences) {
//        this.preferences = preferences;
//    }


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
