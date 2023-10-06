package summary2.inheritance.example1;


public class Dog {
    String typeDog;
    String breed;
     public Dog(String typeDog, String breed) {
         this.typeDog = typeDog;
         this.breed = breed;
     }

    public void voice(){
        System.out.println("Dog voice!");
    }

}