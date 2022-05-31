import java.util.Scanner;
public class resistance 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Press 1 for Series circuit");
        System.out.println("Press 2 for Parallel circuit");
        int e = sc.nextInt();
        switch (e) {
            case 1:
            System.out.println("Enter the r1 and r2");
            int a = sc.nextInt();
        int b = sc.nextInt();
        double c = a+b; //series
        System.out.println("The resistance of Series Circuit="+c);
                
                break;
            case 2:
            System.out.println("Enter the r1 and r2");
            {
            int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        double c1 = a1+b1; //series
        
        double d = a1*b1/c1;
        System.out.println("The resistance of Parallel circuit="+d);
            }

        
            default:
            System.out.print("Wrong Choice");
                break;
     
               }
            
            
    }
  

    
}
