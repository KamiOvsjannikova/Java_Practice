package LessonQA1;

public interface Flyable {

    default void printHello() {
        System.out.println("Hello");
    }

    void fly();

}