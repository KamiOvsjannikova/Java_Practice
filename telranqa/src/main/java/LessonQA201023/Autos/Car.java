package LessonQA201023.Autos;

public class Car {

   protected String name;  // private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void tank() {
        System.out.println("Fill the car " + name + " with gasoline");
    }
}
