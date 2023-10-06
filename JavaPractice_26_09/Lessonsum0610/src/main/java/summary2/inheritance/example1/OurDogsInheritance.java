package summary2.inheritance.example1;

public class OurDogsInheritance {
    public static void main(String[] args) {


        SmallDog smallDog1 = new SmallDog("small", "york", "white");

        SmallDog smallDog2 = new SmallDog("small", "pikiness","brown");

        BigDog bigDog1 = new BigDog("big ", " mastiff");

        BigDog bigDog2 = new BigDog("big", " labrador");


        SmallDog[] smallDogs = {smallDog1,smallDog2};
        BigDog[] bigDogs = {bigDog1, bigDog2};


        Dog[] dogs = {smallDog1,smallDog2,bigDog1,bigDog2};


        for (int i = 0; i < dogs.length; i++) {
            dogs[i].voice();
            //dogs[i].smallDogVoice();
        }
        smallDog1.smallDogVoice();



    }
}