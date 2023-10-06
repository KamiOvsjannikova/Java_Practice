package summary2.fruits;

public class FruitDemo {
    public static void main(String[] args) {
        Apfel apfel = new Apfel(new String[]{"A", "C", "D"},25.5, "green");
        Ananas ananas = new Ananas(new String[]{"B12", "C", "E"},33.5, true);

        Fruit[] fruits = {apfel, ananas};

        for (int i = 0; i < fruits.length; i++) {
            fruits[i].displayInfo();
        }
    }
}