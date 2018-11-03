package guangjian.domain;

public class Provice {
    private int id;
    private String proName;

    public Provice() {
    }

    public Provice(int id, String proName) {

        this.id = id;
        this.proName = proName;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    @Override
    public String toString() {
        return "Provice{" +
                "id=" + id +
                ", proName='" + proName + '\'' +
                '}';
    }
}
