package de.telran.modifiers.other;

public class TestOther {
    public static int intStatic = 5;
    int intDefault = 1;//област видимости  > default
    public int intPublic = 2;
    private int intPrivate = 3;
    protected int intProtected = 4;

    public void testMethod(){
        System.out.println("I am testMethod() with class TestOther");
        System.out.println(intDefault);
        System.out.println(intPublic);
        System.out.println(intPrivate);
        System.out.println(intProtected);

    }
}


