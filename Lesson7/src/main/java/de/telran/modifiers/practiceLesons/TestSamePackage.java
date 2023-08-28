package de.telran.modifiers.practiceLesons;

public class TestSamePackage {
    public void testMethod() {
    }

    public class TestSamePackage {
        static int intStatic = 5;
        int intDefault = 1;
        public int intPublic = 2;
        private int intPrivate = 3;
        protected int intProtected = 4;

        public void testMethod() {
            System.out.println("Я testMethod() в классе TestSamePackage");
            System.out.println(intDefault);
            System.out.println(intPublic);
            System.out.println(intPrivate);
            System.out.println(intProtected);
        }
    }
}
