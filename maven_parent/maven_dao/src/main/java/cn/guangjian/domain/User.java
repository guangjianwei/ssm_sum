package cn.guangjian.domain;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component("user")
public class User implements Serializable{
    private String name;
    private Integer password;
    private Integer sex;

    public User() {
    }

    public User(String name, Integer password, Integer sex) {

        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password=" + password +
                ", sex=" + sex +
                '}';
    }
}
