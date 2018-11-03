package JDBC;

import java.net.URL;

public class test {
    public static void main(String[] args) {
        ClassLoader classLoader = test.class.getClassLoader();
        System.out.println(classLoader);
        URL resource = classLoader.getResource("jdbc.properties");
        System.out.println(resource);
        String path = resource.getPath();
        System.out.println(path);
    }
}
