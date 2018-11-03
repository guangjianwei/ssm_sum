package test_Practice.day05Test;

import java.util.Objects;

public class Car {
    private String  name;
    private String  color;

    public Car() {
    }

    public Car(String name, String color) {

        this.name = name;
        this.color = color;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "名称'" + name + '\'' +
                ", 颜色'" + color + '\'' +
                '}';
    }
}
