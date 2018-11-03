package test_Practice.day13Test;

public class File {
    String name;

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }

    public File(String name) {
        this.name = name;
    }

    public File() {

    }
}
