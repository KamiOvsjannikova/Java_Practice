package LessonQA0112;

public class EqualsObjectTest {
    public static void main(String[] args) {
        Cat catOne = new Cat( 20, "Marsik"); // ssilochnie tipi dannix
        Cat catTwo = new Cat( 20, "Marsik");

        boolean isEquals = catOne == catTwo;
        System.out.println(isEquals);
        // == does not work with references type
        if (catOne ==catTwo) {
            System.out.println("Thea are equals");
        }
        //sravnivatj 2 objecta
        if(catOne.equals(catTwo)) {
            System.out.println("Thea are equals method");
        }

        if (catOne.equals(catTwo)) {
            System.out.println("self equals with method" );
        }
        Cat catThree = new Cat(19, "Marsik");
        if (catOne.equals(catThree)) {
            System.out.println("Hurra ! They are equals");
        }
    }
}
