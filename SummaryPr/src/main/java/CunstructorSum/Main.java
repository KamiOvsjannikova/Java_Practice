package CunstructorSum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start programm");

        ConstructorSummary nameLessConstructorSummary = new ConstructorSummary();
        System.out.println(nameLessConstructorSummary.name);
        System.out.println("-----------------");

        ConstructorSummary shark = new ConstructorSummary("Shark");
        System.out.println(shark.name);
        System.out.println("End programm");
    }
}
