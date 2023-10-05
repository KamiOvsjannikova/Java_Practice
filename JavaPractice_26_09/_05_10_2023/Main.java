package _05_10_2023;


import _05_10_2023.animals.Animal;

//Создать класс животные с 3 полями
//static fur Tiere static method
//static bloc inicializacii
//vivesti sout soobwenie pri luboj inicializacii polja
public class Main {// 2 objecta sozdali i on prowel vse inicializacii, a korova tolka v animal
    public static void main(String[] args) {
        Animal.getCow();
        Animal rhino = new Animal("rhino", false, "grey");
        System.out.println();
        Animal parrot = new Animal("parrot", false, "colorful");
    }
}
