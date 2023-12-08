package lessonQA0812.queue;

public interface MyDeque {
    //FIFO - first input first output - 1-ij priwel, 1-ij uwel
    // -> 4 3 2 1 0->
    // 0 1 2 3 4
    // 5 4 3 2 1 0
    //ArrayDeque - na algoritmax rasmatrivatj budem


    boolean isEmpty();
    void addToTail(Integer element) ;// v xvost dobavitj elementi
    Integer removeHead();

}
