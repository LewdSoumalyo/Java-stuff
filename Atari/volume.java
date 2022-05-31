import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

class volume

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;
        int x;
        System.out.println("Enter 1 to check if a number is buzz number or not");
        System.out.println("Enter 2 to check if a number is odd or even");
        System.out.println("Enter 3 to check if a number is positive or negative");
        x = sc.nextInt();

        switch (x) {
            case 1: {
                System.out.println("Enter the Number");
                b = sc.nextInt();
                if(b%10==7 || b%7==0)
                 {
                     System.out.println("The number entered is a buzz number");
                 }
                 else
                 {
                     System.out.println("The number entered is not a buzz number");
                 } 
            }

                break;

            case 2: {
                System.out.println("Enter the Number");
                b = sc.nextInt();
                if (b%2==0) 
                {
                    System.out.println("The number is even");

                    
                }
                else {
                    System.out.println("The number is odd");
                }
            }
            case 3: {
                System.out.println("Enter the Number");
                b = sc.nextInt();
                if (b!=0) 
                {
                    if (b>0) 
                    {
                        System.out.println("The number is positive");
                        
                    }
                    else
                    {
                        System.out.println("The number is negative");
                    }
                    
                }
                else{ 
                    System.out.println("O is neither a positive nor a negative");

                }

            }
                break;

            default: {
                System.out.println("Enter a valid number");
            }
                break;
        }

    }

}
