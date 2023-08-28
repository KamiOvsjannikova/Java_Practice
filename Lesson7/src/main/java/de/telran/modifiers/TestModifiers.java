package de.telran.modifiers;

import de.telran.modifiers.other.TestOther;
import de.telran.modifiers.practiceLesons.TestSamePackage;

public class TestModifiers {
    public static void main(String[] args) {
        System.out.println(TestOther.intStatic);

        //Работаем с классом в другом пакете
        TestOther  testOtherPackage = new TestOther();
        testOtherPackage.testMethod();
        System.out.println(testOtherPackage.intPublic);

        //Работаем с классом в в том же пакете
        TestSamePackage testSamePackage = new TestSamePackage();
        testSamePackage.testMethod();
        System.out.println(testSamePackage.intPublic);
        System.out.println(testSamePackage.intDefault);
        System.out.println(testSamePackage.intProtected);

    }
}
