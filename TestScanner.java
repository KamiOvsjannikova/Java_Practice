package practice;

import  java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        int myInt;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input number = ");
        myInt = myScanner.nextInt();
        System.out.println("Output number = "+myInt);

        //string
        Scanner myScannerString = new Scanner(System.in);
        String myStr;
        System.out.print("Input string = ");
        myStr = myScannerString.nextLine();
        System.out.println("Output string = "+myStr);

        //boolean
        Scanner myScannerBoolean = new Scanner(System.in);
        boolean myBool;
        System.out.print("Input boolean = ");
        myBool = myScannerBoolean.nextBoolean();
        System.out.println("Output boolean = "+myBool);

        // long
        Scanner myScannerLong = new Scanner(System.in);
        long myLong;
        System.out.print("Input long = ");
        myLong = myScannerLong.nextLong();
        System.out.println("Output long = "+myLong);

        // double
        Scanner myScannerDouble = new Scanner(System.in);
        double myDouble;
        System.out.print("Input double format(XX,X)= ");
        myDouble = myScannerDouble.nextDouble();
        System.out.println("Output double = "+myDouble);

    }
}
