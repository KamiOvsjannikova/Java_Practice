public class SumNumbers {
    public static void main(String[] args) {
        sumMaxNumbers(6,8);
        System.out.println("Sum vsrh vxod numbers ot 0 do Max = "+sumMaxNumbers(4,3));
    }

    static int sumMaxNumbers(int num1, int num2) {
        int sum = 0;
        int maxNumber = (num1 > num2) ? num1 : num2;
        System.out.println("Sum numbers ot 0  = "+maxNumber);
        for (int val = 1; val < maxNumber; val++) sum += val; // sum =sum +val toze samoe
        return sum;
    }
}