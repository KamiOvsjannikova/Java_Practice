import inheritance.Animal;
import inheritance.Dog;
import inheritance.Whale;
import model.Size;

public class Main {
    public static void main(String[] args) {
        Whale whale = new Whale(Size.BIG);

        doAll(whale);
        Dog dog = new Dog();
        doAll(dog);
    }

//    public static void doAll(Whale whale) {
//        whale.eat();
//        whale.sound();
//        whale.move();
//        whale.breathe();

    public static void doAll(Animal animal) {
        animal.eat();
        animal.sound();
        animal.move();
        animal.breathe();
    }
}
