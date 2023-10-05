package _05_10_2023.parents;

public class Father extends Grandpa{
    private String job;
    private static String fatherHello = "I am father";
    static {
        System.out.println(fatherHello);
    }

    public Father(String name, String job) {
        super(name);
        this.job = job;
        System.out.println(fatherHello + " " + job);
    }
    
    public String getJob() {
        return job;
    }

    public static String getFatherHello() {
        return fatherHello;
    }
}
