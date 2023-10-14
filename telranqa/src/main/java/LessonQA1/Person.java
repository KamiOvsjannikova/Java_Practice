package LessonQA1;

public  class Person {
    private String name;
    //method dlja party
    public void printGreetings() {
        System.out.println("Hello I am " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { // peremennaja methoda
        this.name = name; // this - vizivaem etu peremennuju iz etogo klassa
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
