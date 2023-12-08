package lessonQA0812.queue;

public class MyArrayDeque implements MyDeque{
    //zadtj massiv, gde budut xranitsja nawi elementi
    private Integer[] elements;
    //dobavim constructor
    private int numberOfElements;

    private int headIndex;
    private int tailIndex;

    public MyArrayDeque(int capacity) { // capacity za razmer massiva otvechaet
        elements = new Integer[capacity];
        headIndex = capacity -1; // nulevaja indexacija
        tailIndex = capacity -1;
    }

    @Override
    public boolean isEmpty() {
//        if (numberOfElements > 0) {
//            return true;
//        }
        return numberOfElements ==  0;
    }

    @Override
    public void addToTail(Integer element) {
        // proverka kol-vo elementov = dlini massova
        if (numberOfElements == elements.length){
            System.out.println("The queue is full");
            return;
        }
        elements[tailIndex] = element; // prisvaewm v massiv hvosta po index TailIndex - esli mesta ewe estj, to vstavlajem element
        tailIndex--; // sdvigaem v levo
        numberOfElements++; // obwee kol-vo uvelichivaem

    }
// || headIndex = 30
    // () tailIndex = 28;
    // . . . . . . . . . . . . . . . . . . (.) 5 |10|
    // numberOfElements = 2;

    // || headIndex = 29
    // () tailIndex = 28;
    // . . . . . . . . . . . . . . . . . . (.)|5| 10
    // numberOfElements = 1;

    // || headIndex = 28
    // () tailIndex = 28;
    // . . . . . . . . . . . . . . . . . . |(.)| 5 10
    // numberOfElements = 0;
    @Override
    public Integer removeHead() {
        if (headIndex < 0) {
            System.out.println("The  queue is empty ");
            return null;
        }
        Integer current = elements[headIndex];
        headIndex--;
        numberOfElements--;
        return current;
    }

    //We don't know about StringBuilder now
    @Override
    public String toString() {
        String result = "";
        for (int i = tailIndex + 1; i <= headIndex; i++) {
            result = result + " " + elements[i];
        }
        return result;
    }
}
