package de.telran.modifiers.practiceLesons;

public class OurMethods {
    public static void main(String[] args) {
    sumConsol(1,2);
    sumConsol(10,25);

        int sum = sumReturnResult(12,3);
        System.out.println(sum);
        System.out.println(sumReturnResult(10,25));

        int sumTwoMethods = sumReturnResult(2,6) - sumReturnResult(17,8);
        sumTwoMethods = sumTwoMethods + 10;
        sumTwoMethods = sumTwoMethods * 2;
        System.out.println(sumTwoMethods);
    }

    static void sumConsol(int arg1, int arg2) {
        int sum = arg1+arg2;
        String sOut = "Summa = "+sum;
        System.out.println(sOut);
    }

    static int sumReturnResult(int arg1, int arg2) {
        int sum = arg1 + arg2;
        return sum;

    }
}
