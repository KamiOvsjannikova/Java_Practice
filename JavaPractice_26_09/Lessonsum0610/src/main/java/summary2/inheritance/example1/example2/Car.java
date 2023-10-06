package summary2.inheritance.example1.example2;

public class Car {
    private String model;
    private String engine;
    private Double price;
    private String color;

    public Car(String model, String engine, Double price, String color) {
        this.model = model;
        this.engine = engine;
        this.price = price;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public Double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public void displayCarInfo() {
        System.out.println("Car Model:" + getModel());
        System.out.println("Car Engine:" + getEngine());
        System.out.println("Car Price:" + getPrice());
        System.out.println("Car Color:" + getColor());
    }
}
