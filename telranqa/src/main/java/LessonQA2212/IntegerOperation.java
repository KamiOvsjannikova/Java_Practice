package lessonQA2212;
//Dlja togo chtobi ispolzovatj sokrawenuju formu zapisi
//v interfece dolzen bitj tolko 1 metod, kot dolzen bitj realizovan
//Prichem defeultnie i static method nikak ne javl na sokrawennuju formu,
// takix methodov mozet bitj neskolko
// dannij interface - funkcionalnij interface, esli on takoj, to ego mozno zapisatj v sokr. vide ljabdovoe virozenie
@FunctionalInterface
public interface IntegerOperation {
    void multiply(int a); // edistvennij abstract method --- funkcional interface
    default void printGreetings () { // takix zapisej mozet bitj skolko ugodno
        System.out.println("Hello");
    }

    static void printHello() {
        System.out.println("Hello");
    }
}
