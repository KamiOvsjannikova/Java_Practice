package LessonQA0112;

public class PersonTest {

    public static void main(String[] args) {
        Address address = new Address("New-York");
        Person personOne = new Person(1972, address);
        Person personTwo = new Person(1972, address);

        if (personOne.equals(personTwo)) {
            System.out.println("They are equals");
        }
        if (personOne.equals(personTwo)) {
            System.out.println("They are equals with equals method");
        }

        if(personOne.equals(personOne)) {
            System.out.println("" + "self equals with equals method");
        }
        Person personThree = new Person( 1972, address);
        if(personOne.equals(personThree)) {
            System.out.println("Hurra ! They are equals");
        }
    }
}
