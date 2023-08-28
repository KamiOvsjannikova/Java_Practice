public class TestExample {
    public static int sum(int firstnumber, int secondnumber) {
        return firstnumber + secondnumber;
    }
    //avto test
    public static void positiveSumTest() {
        int currantResult = sum(15, 21); // testiruem sum
        int expectedResult = 36;

        if (currantResult == expectedResult) System.out.println("test was secssful");
        else System.err.println("test unssecssful");

        //System.out.println(currantResult);
    }
    public static void assertNumberEquals(int  currentNumber, int expectedNumber) {

        if (currentNumber == expectedNumber) System.out.println("test are equal");
        else {
            System.err.println("This number aren't equal \n");
            System.out.println();
            System.err.println("Current: " + currentNumber);
            System.err.println("Expected: " + expectedNumber);
        }
    }
}
