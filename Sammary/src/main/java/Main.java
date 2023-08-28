public class Main {

    public static void main(String[] args) {
        TestExample.positiveSumTest();

        int result = TestExample.sum(15, 21);
        int expected =26;

        TestExample.assertNumberEquals(result, expected);


        //int first = 15;
        //int second = 21;

        //System.out.println(TestExample.sum(first, second)); // manual test
    }
}
