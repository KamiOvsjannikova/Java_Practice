public class UnaryOperators {

    public static void main(String[] args) {
        int val1 = 10, val2 = 20;
        System.out.println("Summa 2ux chisel = " + (val1+val2)); //30

        System.out.println("Postfiksnij Inkrement chisel = " + (val1++)); //eto toze samoe, chto  val1 = val1 +1; 10

        System.out.println("Posfiksnij Dekrement chisla = " + (val2--)); //eto toze samoe, chto  val2 = val2 -1; 20

        System.out.println("Prefeksnij Inkrement chisel = " + (++val1)); //eto toze samoe, chto  val1 = val1 +1; 12

        System.out.println("Prefeksnij Dekrement chisla = " + (--val2)); //eto toze samoe, chto  val2 = val2 -1; 18

//Zadanie
        val1++; //12 +1 =13
        System.out.println("Pechatj chisla = " + (val1)); //13

        System.out.println("Menjaem chislo na protivopoloznoe znachenie = " + (-val1)); // budet -13
        System.out.println("Ewe raz Menjaem chislo na protivopoloznoe znachenie = " + (-val1)); //budet vsjo ravno -13
        int val3 = -val1;
        System.out.println("Pechatj chisla val3 = " + val3); //-13
        int val4 = -val3;
        System.out.println("Pechatj chisla val4 = " + val4);//13
    }
}
