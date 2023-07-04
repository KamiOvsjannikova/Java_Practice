public class LogicProject {
    public static void main(String[] args) {
        int val1 = 10, val2 = 15, val3 = -5, val4 = 10;

        System.out.println("val1 < val2 " + (val1 < val2));//10<15
        System.out.println("val1 == val4 " + (val1==val4));//10==15
        //logicheskij operator && (i)

        System.out.println("val1 < val2 && val1 == val4" + ((val1 < val2) && (val1 == val4))); // 10<15 true && 10=10  true pervoe i true vtoroe i obwee true

        System.out.println("val1 < val2 && val1 == val3" + ((val1 < val2) && (val1 == val3)));//10<15 true && 10=-5 false obwee budet false
        System.out.println("val1 < val2 && val1 == val4 && val1 > val3 " + ((val1 < val2) && (val1 == val4) && (val1 > val3)));//10<15 && 10==10 && 10>-5 true vsjo
        System.out.println("val1 < val2 && val1 == val4 && val1 <= val3 " + ((val1 < val2) && (val1 == val4) && (val1 <= val3)));//10<15 && 10==10 && 10<=-5 false vsjo

        // logicheskij operator || (ili)
        System.out.println("-------------------------");
        System.out.println("val1 < val2 || val1 == val4 " + ((val1 < val2) || (val1 == val4))); // 10<15 true || 10==10 true vsjo true
        System.out.println("val1 < val2 || val1 == val3 " + ((val1 < val2) ||  (val1 == val3)));//10<15 true || 10==-5 false vsjo true
        System.out.println("val1 < val2 || val2 == val4 || val1 <= val3 " + ((val1 < val2) || (val2 == val4) || (val1 <= val3)));//10<15 true || 15==10 false|| 10<= -5 false vsjo true
        System.out.println("val1 <-> val2 || val2 == val4 || val1 <= val3 " + ((val1 > val2) || (val2 == val4) || (val1 <= val3)));//10>15 false || 15==10 false|| 10<= -5 false vsjo false

        //logicheskij operator ! (NOT -NE)
        System.out.println("-------------------------");
        System.out.println("val1 < val2 " + (val1 < val2)); // 10<15 true
        System.out.println("val1 < val2 " + !(val1 < val2)); // !(10<15) v skobkax true, no ! menjaet na false
        System.out.println("val1 > val2 " + !(val1 > val2)); // !(10>15) v skobkax false, no ! menjaet na true

        System.out.println("!(val1 < val2 && val1 == val4 && val1 > val3) " + !((val1 < val2) && (val1 == val4) && (val1 > val3))); //!(10<15 && 10==10 && 10>-5) potormu chto vsjo bilo tru, ! menjaem na vsjo false
        System.out.println("val1 > val2 || val2 == val4 || val1 <= val3 "
                + ((val1 > val2) || (val2 == val4)  || (val1 <= val3))); //10>15 || 15==10 || 10<=-5
        System.out.println("!(val1 < val2 || val2 == val4 || val1 <= val3) "
                + !((val1 < val2) || (val2 == val4)  || (val1 <= val3))); //!(10<15 || 15==10 || 10<=-5)

        System.out.println("!val1 < val2 || val2 == val4 || val1 <= val3 "
                + (!(val1 < val2) || (val2 == val4)  || !(val1 <= val3))); //!10<15 || 15==10 || !10<=-5
    }
}
