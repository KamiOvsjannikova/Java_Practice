package lessonQA2212;

public class ExamoleAboutInt {
    public static void main(String[] args) {
        IntegerOperationImpl operationOne = new IntegerOperationImpl();
        doSomething(operationOne);
    }

    private static void doSomething(IntegerOperationImpl operation) {
        operation.multiply(6);
    }
}
