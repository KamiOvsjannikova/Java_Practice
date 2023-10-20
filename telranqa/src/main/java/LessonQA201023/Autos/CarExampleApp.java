package LessonQA201023.Autos;

public class CarExampleApp {
    public static void main(String[] args) {
        BigCar bigCar = new BigCar();
        SmallCar smallCar = new SmallCar();

        bigCar.setName("Tatra");
        smallCar.setName("Opel");

        //vizivaem method tank
        bigCar.tank();
        smallCar.tank();

        Bus bus = new Bus();
        bus.setName("Autobus");
        bus.tank(); // budet ot bigcar tank bratj, t.e. diesel// a teperj budet gas, v nem uze estj method tank
    /* Car
        ^
       Big car
        ^
        Bus
     */
        fillCar(bigCar);
        fillCar(smallCar);
        fillCar(bus);
    }
    private  static void fillCar(Car car) {
        car.tank(); // budet bratj iz naslednikov tank
    }

}
