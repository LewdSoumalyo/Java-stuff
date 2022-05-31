package test;

import java.util.Scanner;
public class pen
{
public static void main (String args[])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Press 1 for Term Deposit");
    System.out.println("Press 2 for Recuring Deposit");
    System.out.println("Enter your choice");
    int m = sc.nextInt();
    switch(m)
    {
        case 1:
            {
                int p,n;
            
                double r,a= 0.0;
                System.out.println("Enter the principal amount");
                p = sc.nextInt();
                System.out.println("Enter the rate of interest ");
                r = sc.nextFloat();
                System.out.println("Enter the time period in years");
                n = sc.nextInt();
                a=p*(Math.pow((1+r/100),n));
                System.out.println("Maturity amount="+a);
                
                
                
            }
        case 2:
            {
                int p,n;
                double r,a= 0.0;;
                System.out.println("Enter the monthly installment");
                p = sc.nextInt();
                System.out.println("Enter the rate of interest ");
                r = sc.nextDouble();
                System.out.println("Enter the the time period in months");
                n = sc.nextInt();
                a = p*n + p * n *(n+1) * r/100 * 2 * 12;
                System.out.println("Maturity amount="+a);
                
            }
        default:
            System.out.println("Select a proper choice");
    }
    
    
}
}