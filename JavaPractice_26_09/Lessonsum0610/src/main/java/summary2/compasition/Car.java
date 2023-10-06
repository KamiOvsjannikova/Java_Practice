package summary2.compasition;


public class Car { // compazicija object klass Car polnostju upravlaet objectom CarBody
    private CarBody carBody;

    public Car(String carType) {this.carBody = new CarBody(carType); }
    //pri sozdanii ekzemplara klass Car mi sozdaem ekzemplar klass CarBody
}
