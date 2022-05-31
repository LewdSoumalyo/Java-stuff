import java.util.Scanner;

public class temparature 
{
    public static void main(String[] args) 
    {
        System.out.println("Press 1 for farenheit and 2 for celcius");
        Scanner sc = new Scanner(System.in);
        int  a,b;
        a = sc.nextInt(); 
        b =sc.nextInt();
        switch (a) 
        {
        
            case 1:
            {
                System.out.println("Enter temparature");

            int f = sc.nextInt();
            int c = (5/9*(f-32));
            System.out.println("Temparature"+c);
             } 
            break;
            case 2:{
                System.out.println("Enter the temparature");
                int f = sc.nextInt();
                double c =(1.8*f+32);
                System.out.println("The temp in farenheit ="+b);
                
            }
            break;
            default:
            {
                System.out.println("Please Enter a valid number");
            }
            
        }        
    }

    
}
