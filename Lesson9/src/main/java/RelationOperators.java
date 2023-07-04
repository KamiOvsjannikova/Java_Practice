public class RelationOperators {
    public static void main(String[] args) {
        int val1 = 10, val2 = 15, val3 = -5, val4 = 10;

        // opertor == (sravnenie)
        System.out.println("val1 == val2 " + (val1 == val2));//10 == 15 false 10 ne ravno 15
        System.out.println("val1 == val4 " + (val1 == val4)); // 10 == 10 true

        //operator != (neravno)
        System.out.println("val1 != val2 " + (val1 != val2));//10 != 15 true oni neravni
        System.out.println("val1 != val4 " + (val1 != val4)); // 10 != 10 false a tut ravno

        //operator > (bolwe)
        System.out.println("val1 > val2 " + (val1 > val2));//10 > 15 false 10 menwe 15
        System.out.println("val1 > val4 " + (val1 > val4)); // 10 > 10 false tut =
        System.out.println("val1 > val3 " + (val1 > val3)); // 10 > -5 true

        //operator < (menwe)
        System.out.println("val1 < val2 " + (val1 < val2));//10 < 15 true
        System.out.println("val1 < val4 " + (val1 < val4)); // 10 < 10 false tut =
        System.out.println("val1 < val3 " + (val1 < val3)); // 10 < -5 false

        //operator >= (bolwe libo =)
        System.out.println("val1 >= val2 " + (val1 >= val2));//10 >= 15 false
        System.out.println("val1 >= val4 " + (val1 >= val4)); // 10 >= 10 true
        System.out.println("val1 >= val3 " + (val1 >= val3)); // 10 >= -5 true

        //operator <= (bolwe libo =)
        System.out.println("val1 <= val2 " + (val1 <= val2));//10 <= 15 true
        System.out.println("val1 <= val4 " + (val1 <= val4)); // 10 <= 10 true
        System.out.println("val1 <= val3 " + (val1 <= val3)); // 10 <= -5 false

        //sravnenie raznix tipov
        double dblVal = 10.5;
        System.out.println("----------");
        System.out.println("val1 >= dblVal " + (val1 >= dblVal));//10.0 >= 10.5 false on sravnivaet int = 32 byte i double 64 byte
        System.out.println("val1 <= dblVal " + (val1 <= dblVal));//10.0 <= 10.5 true

        System.out.println("val1 >= (int)dblVal " + (val1 >=(int)dblVal));//true javnoe preobrazovanie double v int. 10>= 10 0.5uwla, potomu chto v int preobrazovali
       //okruglenie
        System.out.println("Okruglenie double dbVal = "+Math.round(dblVal)); // 11 - potomu chto 10.5 okruglaetsja
        System.out.println("Preobrazovanie double dbVal = "+(int)(dblVal)); // 10 - potomu chto 10.5 otbrasivaet 0,5

    }
}