package cn.guangjian.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component("user")
public class User implements Serializable{
    private String userName;
    private Integer userPsw;
    private Integer userSex;

    public User() {
    }

    public User(String userName, Integer userPsw, Integer userSex) {

        this.userName = userName;
        this.userPsw = userPsw;
        this.userSex = userSex;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserPsw() {
        return userPsw;
    }

    public void setUserPsw(Integer userPsw) {
        this.userPsw = userPsw;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userPsw=" + userPsw +
                ", userSex=" + userSex +
                '}';
    }
}
