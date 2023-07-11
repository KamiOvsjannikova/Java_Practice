public class TestWhileUndFor {
    public static void main(String[] args) {
        runHelloFor();
        System.out.println("");
        runHelloWhile();
        System.out.println("");
        runHelloWhileTrue();

    }
    static void runHelloFor() { //Method For - dlja prognoz sluchaev, kogda znaem,chto budet vipolnjatsja
        for(int count=10;count>0;count--)
            System.out.println("Hello programm - "+count);
        }


    static void runHelloWhile() { // Method WHILE
        int count=10;
        while (count >0) {
            System.out.println("Hello programm - "+count);
            count--; //blok izmenenija sostojanija
        }
    }
    //вечный цикл при помощи While
    static void runHelloWhileTrue() {
        int count = 10;
        while (true) { // true govorit o vechnom cikletemp
            System.out.println("Hello programm - "+count);
            count --;
            if(count<1) break; //vihod iz nego
        }
    }
}