import java.util.Scanner;
public class square 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a<0&&b<0) 
        {
            System.out.print("number entered is negative"); 
            
        }
        if (a==b) 
        {
            System.out.println("The numbers are same ");
            
        }
        
    }

    
}