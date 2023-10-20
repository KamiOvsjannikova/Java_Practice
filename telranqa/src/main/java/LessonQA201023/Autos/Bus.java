package LessonQA201023.Autos;

public class Bus extends BigCar {
    @Override
    public void tank() {
        System.out.println("Fill the car " + name + " with Gas"); //super.tank();
    }
}
