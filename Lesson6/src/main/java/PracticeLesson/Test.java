package PracticeLesson;

public class Test {

    public int myIntTest;

    public Test() {
        System.out.println("Started  Test()");
        myIntTest = 1;
    }
/*
    public Test(int myInt) {
        System.out.println("Started Test(int myInt)");
        myIntTest = myInt;
    }
    */

    public Test(int myIntTest) {
        System.out.println("Started Test(int myInt)");
        this.myIntTest = myIntTest;
    }

    public void run() {
        myIntTest = myIntTest +2;
        this.myIntTest = this.myIntTest + 2;
        System.out.println("Test -> run()"+myIntTest);
  }
}
