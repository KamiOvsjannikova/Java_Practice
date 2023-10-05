package inheritance;

import model.FoodType;
import model.Habitat;
import model.Size;

public abstract class Animal {
    private final Size size;
    private final FoodType foodType;
    private final Habitat habitat;

    public Animal(Size size, FoodType foodType, Habitat habitat) {
        this.size = size;
        this.foodType = foodType;
        this.habitat = habitat;
    }

    public abstract void move(); // esli dvigaetsja, no nichego ne otdaet
    //obstraktnij method bez {}

    public abstract void eat();
    public abstract void sound();
    public void breathe() {
        System.out.println("Ja diwu - znachit, ja lublu!");
    }
}
