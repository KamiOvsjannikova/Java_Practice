package _05_10_2023.animals;
//Создать класс животные с 3 полями
//static fur Tiere static method
//static bloc inicializacii
//vivesti sout soobwenie pri luboj inicializacii polja

public class Animal {
    //piwem polja
    // private static final Animal COW = new Animal("COW" ,  false , "black and white"); // sozdali peremennuju, eto uze ne izmenjaetsja.
    // //chto budet xranitj dla vsex animals
    private static Animal cow = new Animal("COW", false, "black and white");// eta korova menjaetsja

    //blok inicializacii static
    static {
        System.out.println();
        System.out.println(cow);
//proanaliz zanovo COW
        cow = new Animal("bull", false, "black and white");
        System.out.println(cow);
        System.out.println();
    }

    public static Animal getCow() {
        return cow;
    }

    private String type;
    private boolean isPredator; //xiwnij
    private String color;

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", isPredator=" + isPredator +
                ", color='" + color + '\'' +
                '}';
    }

    {
        System.out.println(this); // vivesti texuwij object
        type = "lion";
        isPredator = true;
        color = "yellow";
        System.out.println(this);
    }

    public Animal(String type, boolean isPredator, String color) {
        this.type = type;
        this.isPredator = isPredator;
        this.color = color;
        System.out.println(this);
    }

    public String getType() {
        return type;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public String getColor() {
        return color;
    }
}
