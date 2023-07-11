import java.util.Scanner;

public class BuildSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite visotu = ");
         int height = scanner.nextInt();
        System.out.println("\n vvedite wirinu = ");
        int width = scanner.nextInt();
        build(width, height);
        build(45,8);
    }
    static void build(int width, int height) {
        for (int j=0; j<height; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }
}
