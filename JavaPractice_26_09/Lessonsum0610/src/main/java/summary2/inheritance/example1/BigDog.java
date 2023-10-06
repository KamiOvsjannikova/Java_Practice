package summary2.inheritance.example1;

public class BigDog extends Dog{
    public BigDog(String typeDog, String breed) {
        super(typeDog, breed);
    }
    @Override
    public void voice() {
        System.out.println(typeDog + " dog voice! " + breed);
    }

    // в связи с тем что мы сделали это класс наследником от родительского
    // и сумели переопределить метод в родительском классе то
    // метод bigDogVoice нам больше может быть не нужен
    public void bigDogVoice(){
        System.out.println("Big dog voice!");
    }
}