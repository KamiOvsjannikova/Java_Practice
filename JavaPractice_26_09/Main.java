import inheritance.Whale;
import model.Size;

public class Main {
    public static void main(String[] args) {
        Whale whale = new Whale(Size.BIG);

        whale.eat();
        whale.sound();
        whale.move();
        whale.breathe();
    }
}
