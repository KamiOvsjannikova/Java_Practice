package _05_10_2023.parents;

public class Me extends Father{
    private String hobby;
    private static String myHello = "I am myself";
    static {
        System.out.println(myHello);
    }

    public Me(String name, String job, String hobby) {
        super(name, job);
        this.hobby = hobby;
        System.out.println(myHello + " " + job + " " name + " " hobby);
    }

    public String getHobby() {
        return hobby;
    }

    public static String getMyHello() {
        return myHello;
    }
}
