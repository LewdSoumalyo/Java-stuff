import java.util.Scanner;
public class peta 

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to find the sum of the numbers");
        System.out.println("Press 2 to find the difference of the numbers");
        System.out.println("Press 3 to find the product  of the numbers");
        int a = sc.nextInt();
        int b,c,d;
        switch (a) {
            case 1:
            {
                System.out.println("Enter two numbers");
                 b=sc.nextInt();
                 c=sc.nextInt();
                 d= a+b;
                System.out.println("The Sum of the two numbers are="+d);
            }
            break;
            case 2:
            {
                System.out.println("Enter two numbers");
                 b=sc.nextInt();
                 c=sc.nextInt();
                 d= a-b;
                System.out.println("The Difference of the two numbers are"+d);


            }
            case 3:
            {
                System.out.println("Enter two numbers");
                 b=sc.nextInt();
                 c=sc.nextInt();
                 d= a*b;
                System.out.println("The peoduct of the two numbers are"+d);
            }
                
                break;
        
            default:{
                System.out.println("Enter a valid number");
            }

                break;
        }
    }

    
}
