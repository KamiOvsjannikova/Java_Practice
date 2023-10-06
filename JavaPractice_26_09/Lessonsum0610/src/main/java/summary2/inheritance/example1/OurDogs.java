package summary2.inheritance.example1;


import java.util.Arrays;

public class OurDogs {
    public static void main(String[] args) {

        SmallDog smallDog1 = new SmallDog("small", "york", "white");

        SmallDog smallDog2 = new SmallDog("small", "pikiness","brown");

        BigDog bigDog1 = new BigDog("big ", " mastiff");

        BigDog bigDog2 = new BigDog("big", " labrador");

//        smallDog1.smallDogVoice();
//        smallDog2.smallDogVoice();
//        bigDog1.bigDogVoice();
//        bigDog2.bigDogVoice();

        SmallDog[] smallDogs = {smallDog1,smallDog2};

        System.out.println(Arrays.toString(smallDogs));
        System.out.println(Arrays.toString(smallDogs));

        BigDog[] bigDogs = {bigDog1,bigDog2};

        for (int i = 0; i < smallDogs.length; i++) {
            // smallDogs[i].voice();
            smallDogs[i].smallDogVoice();
        }

        for (int i = 0; i < bigDogs.length; i++) {
            bigDogs[i].bigDogVoice();
        }

    }
}
