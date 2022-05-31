import java.util.Scanner;

public class avatar {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance");
        a = sc.nextInt();
        System.out.println("Enter the Taxi number");
        c = sc.nextInt();

        if (a <= 5) {
            System.out.println("The taxi number=" + c);
            System.out.println("The Distance covered=" + a);
            System.out.println("The amount to be paid=100");
        }
        if (a > 5 && a <= 15) {
            b = a * 10;
            System.out.println("The taxi number=" + c);
            System.out.println("The Distance covered=" + a);
            System.out.println("The amount to be paid=" + b);
        }
        if (a > 15 && a <= 25) {
            b = a * 8;
            System.out.println("The taxi number=" + c);
            System.out.println("The Distance covered=" + a);
            System.out.println("The amount to be paid=" + b);
        }
        if (a > 25) {
            b = a * 5;
            System.out.println("The taxi number=" + c);
            System.out.println("The Distance covered=" + a);
            System.out.println("The amount to be paid=" + b);
        }

    }
}
