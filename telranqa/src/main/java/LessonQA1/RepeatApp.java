package LessonQA1;
//inkopsuljacija
public class RepeatApp {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alex");

        Person personOne = new Person();
        personOne.setName("Oleg");

        System.out.println("Name = " + person.getName()); // to string pereopredel klassa person ---> budet Name = Alex
        System.out.println(personOne);


    }
}
