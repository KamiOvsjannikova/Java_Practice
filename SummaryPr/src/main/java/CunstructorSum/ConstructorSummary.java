package CunstructorSum;

public class ConstructorSummary {
    public int age;
    public String name;
    public ConstructorSummary() {

        System.out.println("Thi is constructor class");

        System.out.println("Object klass constrocur bil sozdan");
    }
    public ConstructorSummary(String name) {
        this.name = name;
    }

    public ConstructorSummary(String name, int age) {

    }
}
