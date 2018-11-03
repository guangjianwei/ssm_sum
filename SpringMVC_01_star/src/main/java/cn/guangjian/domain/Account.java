package cn.guangjian.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Account implements Serializable{
    private int id;
    private String username;
    private Double balance;
    private User user;
    private List<User> list;
    private Map<String,User> map;
    public Account(int id, String username, Double balance, User user) {
        this.id = id;
        this.username = username;
        this.balance = balance;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                ", user=" + user +
                ", list=" + list +
                ", map=" + map +
                '}';
    }
}
