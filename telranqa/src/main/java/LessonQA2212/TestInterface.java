package lessonQA2212;

public class TestInterface {
    public static void main(String[] args) {
        IntegerOperation integerOperation = new IntegerOperationImpl();
        integerOperation.multiply(45);

        IntegerOperationImplApp integerOperationImplApp = new IntegerOperationImplApp();
        integerOperationImplApp.multiply(9);

        //Use Functional Interface
        // v dannom kode srazu sozdajem object kotorij implementiruet intere
        IntegerOperation operation = new IntegerOperation() {
            @Override
            public void multiply(int a) {
                System.out.println(a * 2);

            }
        };

        operation.multiply(30);



        IntegerOperation operationMultiplyThree = new IntegerOperation() {
            @Override
            public void multiply(int a) {
                System.out.println( a * 3);
            }
        };
        operationMultiplyThree.multiply(5);

        IntegerOperation operationMultiplyFour = new IntegerOperation() {
            @Override
            public void multiply(int a) {
                System.out.println( a * 4);
            }
        };
        operationMultiplyFour.multiply(7);

        //Short form use lambda
        IntegerOperation operationMultThree = a -> System.out.println(a *3); // eto odna sroka pokazivaet to cho mi pisali viwe. sokrawaet kod

        operationMultThree.multiply(8);

    }
}
