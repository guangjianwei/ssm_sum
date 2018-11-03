package cn.guangjian.spring.domain;

public class Account {
    int id;
    String sorts;
    String money;

    public Account() {
    }

    public Account(int id, String sorts, String money) {

        this.id = id;
        this.sorts = sorts;
        this.money = money;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSorts() {
        return sorts;
    }

    public void setSorts(String sorts) {
        this.sorts = sorts;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sorts='" + sorts + '\'' +
                ", money='" + money + '\'' +
                '}';
    }
}
