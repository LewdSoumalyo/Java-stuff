import java.util.Scanner;

public class clotch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total cost");
        int a, b;
        a = sc.nextInt();
        if (a <= 2000) {
            b = 5 / 100 * a;
            System.out.println("The discount=" + b);
            System.out.println("The gift is calculator, discounr =" + b);

        }
        if (a > 2000 && a <= 5000) {
            b = 10 / 100 * a;
            System.out.println("The discount=" + b);
            System.out.println("The gift is School bag ");

        }
        if (a > 5000 && a <= 10000) {
            b = 15 / 100 * a;
            System.out.println("The discount=" + b);
            System.out.println("The gift is Wall cock ");

        }
        if (a > 10000) {
            b = 20 / 100 * a;

            System.out.println("The gift is wrist watch ");
            System.out.println("The discount=" + b);

        }

    }

}
