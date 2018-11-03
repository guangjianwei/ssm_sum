package cn.guangjian.mybatis.domain;

import java.io.Serializable;

public class Account implements Serializable {
      private int id;
      private int uid;
      private double money;
      private User user;

    public User getUser(){
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public Account() {
    }

    public Account(int id, int uid, double account) {

        this.id = id;
        this.uid = uid;
        this.money = account;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", account=" + money +
                '}';
    }
}
