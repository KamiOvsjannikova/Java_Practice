package PracticeLesson;

public class TestConstructor {
    public static void main(String[] args) {
        int myInt;
        myInt = 15;

        Test myTest;
        myTest = new Test();
        System.out.println(myTest.myIntTest);

        Test myTestWithParameter = new Test(22);
        System.out.println(myTestWithParameter.myIntTest);

  //      test.run();

        outString("peredavajaemaja stroka");
        String myStr = "Maksim busja";
        outString(myStr);
        outTwoValue(myStr, 18);
    }

    static void outString(String inStr) {
        String localStr = inStr.toLowerCase();
        System.out.println("Our string -> "+inStr);
        System.out.println("localStr -> "+localStr);
    }
    // metod s 2 parametrami
    static void outTwoValue(String inStr, int inInt) {
        String localStr = inStr.toUpperCase();
        System.out.println("Our string -> "+inStr);
        System.out.println("Our number -> "+inInt);
        System.out.println("localStr -> "+localStr);
    }
}
