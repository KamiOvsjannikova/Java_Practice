public class TestaForEach {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        for (int val : arr) { //val=1
            System.out.println(val);
            if(val == 3) break;
        }
    }
}
