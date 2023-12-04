package Code;

import java.io.Serializable;

public class Vehicle<T> implements Serializable, Comparable<Vehicle> {
    private String name;
    private String color;
    private String brand;
    private T id;

    public Vehicle() {
    }

    public Vehicle(String name, String color, String brand) {
        this.name = name;
        this.color = color;
        this.brand = brand;
    }

    public Vehicle(String name, String color, String brand, T id) {
        this.name = name;
        this.color = color;
        this.brand = brand;
        this.id = id;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vehicle o) {
        return this.getName().compareTo(o.getName());
    }
    public <T> void myPrint(T a, T b){
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
