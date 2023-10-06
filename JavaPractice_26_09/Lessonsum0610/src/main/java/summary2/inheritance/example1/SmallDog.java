package summary2.inheritance.example1;

public class SmallDog extends Dog{


    private String color;

    public SmallDog(String typeDog, String breed, String color) {
        super(typeDog, breed);
        this.color = color;
    }


    @Override
    public void voice() {
        System.out.println(typeDog + " dog voice! " + breed);
    }

    public void smallDogVoice(){
        System.out.println(typeDog + " dog voice! " + breed);
    }
}