package _05_10_2023.parents;
//1 Создайте классы Grandpa, Father и Me. Свяжите их наследованием.
//2 В каждом классе создайте одно поле типа String и одно статическое поле типа String.
//3 Создайте блок инициализации и статический блок в каждом классе. Создайте конструктор в каждом классе.
//4 Выведите в консоль сообщение «выполняется блок …» из каждого блока инициализации и конструктора.
//5 Создайте объект Me в main и проанализируйте вывод в консоль.

public class Grandpa {
    private String name;
    private static String hello =  "I am Grandpa";

    static {
        System.out.println(hello);
    }
    public Grandpa(String name) {
        this.name = name;
        System.out.println(hello + " " + name);
    }

    public String getName() {
        return name;
    }

    public static String getHello() {
        return hello;
    }
}
