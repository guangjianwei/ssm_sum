package JDBC.DruidSpring;

import java.util.Date;

public class emp {
    Integer id ;
    String  name;
    Integer password;
    Date date;

    public emp() {
    }

    public emp(Integer id, String name, Integer password, Date date) {

        this.id = id;
        this.name = name;
        this.password = password;
        this.date = date;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password=" + password +
                ", date=" + date +
                '}';
    }
}
