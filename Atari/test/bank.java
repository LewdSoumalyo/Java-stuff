package test;
import java.util.Scanner;
public class bank 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount");
        int a = sc.nextInt();
        System.out.println("Enter the days");
        int b = sc.nextInt();
        double c,d,e;
        if (b<=180) 
        {
            c = (a*5.5*b)/100;
            System.out.println("The total amount ="+c);
            
        }
        if (b>180) 
        {
            c = (a*7.5*b)/100;
            System.out.println("The total amount ="+c);
            
        }
        if (b==365) 
        {
            c = (a*9*b)/100;
            System.out.println("The total amount ="+c);
            
        }
        if (b>365) 
        {
            c = (a*8.5*b)/100;
            System.out.println("The total amount ="+c);
            
        }
        
    }
    
}
