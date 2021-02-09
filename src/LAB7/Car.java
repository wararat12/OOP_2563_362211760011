package LAB7;

public class Car {
    //attributes
    private String id;
    private String color;
    private String brand;

    public Car() {
    }

    public Car(String id, String color, String brand) {
        this.id = id;
        this.color = color;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}//class
