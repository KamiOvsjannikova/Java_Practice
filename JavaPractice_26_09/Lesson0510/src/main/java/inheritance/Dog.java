package inheritance;

import model.FoodType;
import model.Habitat;
import model.Size;

public class Dog extends Animal{
    public Dog() {
        super(Size.SMALL, FoodType.CARNOVORES, Habitat.GROUND);
    }

    @Override
    public void move() {
        System.out.println("Ja begaju po zemle");
    }

    @Override
    public void eat() {
        System.out.println("Ja em drugix zivotnix");

    }

    @Override
    public void sound() {
        System.out.println("Gav gav");
    }
}
