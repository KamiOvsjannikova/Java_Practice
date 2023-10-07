package summary2.abstracts;

public class AnimalDemo {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Dog dog = new Dog();
        Worm worm = new Worm();

        fish.breath();
        dog.breath();
        worm.breath();

        fish.setEatable(true);

        System.out.println("===========");

        Animal[] animals = {dog, fish, worm};

        for (int i = 0; i < animals.length; i++) {
            animals[i].breath();
        }
    }
}
