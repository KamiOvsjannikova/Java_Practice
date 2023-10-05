package inheritance;

import model.FoodType;
import model.Habitat;
import model.Size;

public class Whale extends Animal {

    //konstruktor
    public Whale(Size size) {
        super(size,FoodType.CARNOVORES, Habitat.WATER);
    }

    @Override // pereopredel method i tut mi budem realizovivatj
    public void move() {
        System.out.println("Ja plavaju v vode");
    }

    @Override
    public void eat() {
        System.out.println("Ja em drugix zivotnix");

    }

    @Override
    public void sound() {
        System.out.println("UuuuUuuUUUU");

    }
}
