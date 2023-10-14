package LessonQA1;

public class Child extends Person {
    @Override
    public void printGreetings() {
        System.out.println("Hi , I am a child " + getName());//super.printGreetings();
    }
}
