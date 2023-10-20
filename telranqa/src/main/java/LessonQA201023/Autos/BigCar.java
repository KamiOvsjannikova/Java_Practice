package LessonQA201023.Autos;

public class BigCar extends Car {
    @Override // pereopredel methoda
    public void tank() {
       // super.tank(); // super - mozem iz klassa naslednika  obratitsja iz klassa roditelja
        //piwem svoj kod
        //System.out.println("Fill the car " + getName() + " with diesel"); //super.getname - esli bi u tebja tut bil bi ewe get name
        System.out.println("Fill the car " + name + " with diesel"); // name stala dostupna, potomu chto mi stedlali protected String name v class car (roditelj)
    }
}
