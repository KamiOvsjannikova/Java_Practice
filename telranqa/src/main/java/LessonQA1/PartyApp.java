package LessonQA1;

public class PartyApp {
    public static void main(String[] args) {
        //sodanije objectov
        Man man = new Man(); // mozno napistaj Person man = new Man();
        man.setName("Alex"); // ustanovili name
        man.printHello();


        //Person person1 = new Man(); // sozdalasja v pamatji kucha
        //person1.getName();
        //Man person1 = new Man();
        //person1.printHello();// roditelj ne mozet znatj o naslednikax nichego,  naslediki mogut zmatj vsjo o roditeljax
        //Person person1 = new Man();

        Woman woman = new Woman(); // mozno napistaj Person woman = new Woman();
        woman.setName("Elena");
        woman.printGreetings();

        Child child = new Child();// mozno napistaj Person child = new Child();
        child.setName("Max");
        child.printGreetings();

        Junior junior = new Junior(); // mozno napistaj Person Junior  = new Junior();
        junior.setName("Petr");


        //objedenjaem v obwij massiv
        Person[] people = {man, woman, child, junior};

         for (int i = 0; i < people.length; i ++) {
             Person person = people[i];
             person.printGreetings();
         }
//        //Example
//        for(Person person : people) {
//            person.printGreetings();
//        }
    }
}
