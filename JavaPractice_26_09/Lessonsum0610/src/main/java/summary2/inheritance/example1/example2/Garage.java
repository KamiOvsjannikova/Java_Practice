package summary2.inheritance.example1.example2;

public class Garage {
    public static void main(String[] args) {
        Truck truck1 = new Truck("V3500","Disel",45500.00, "grey", "Volvo",60000.00);

        PassengerCar passengerCar1 = new PassengerCar("Mercedes GLC 500", "Petrol", 65000.00,"Black", 7);

        Car carMain = new Car("Toyota", "Electric", 33000.00, "Silver");

        carMain.displayCarInfo();


//        truck1.displayCarInfo();
//        passengerCar1.displayCarInfo();

        Car[] cars = {passengerCar1, truck1};

        for (int i = 0; i < cars.length; i++) {
            cars[i].displayCarInfo();
        }
    }
}