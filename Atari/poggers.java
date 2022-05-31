import java.util.Scanner;
public class poggers 
{
    public static void main(String[] args) 
    {
        System.out.println("1. Ground Floor : Kids Wear");
        System.out.println("2. First Floor : Ladies Wear");
        System.out.println("3. Second Floor : Designer Wear");
        System.out.println("4. Third Floor : Mens Wear");
        Scanner sc = new Scanner(System.in); 
        
            int a = sc.nextInt();
            switch (a) 
            {
                case 1:
                {
                    System.out.println("Welcome to Kids Wear");
                    System.out.println("Enter the number of Items bought");
                    int b = sc.nextInt();
                    System.out.println("Enter the price of the items");
                    int c = sc.nextInt();
                    int d = c*b;
                    System.out.println("City Mart");
                    System.out.println("The Total prize to be paid="+d);
                    System.out.print("Visit again");
                }
                    break;
                case 2:
                {
                    System.out.println("Welcome to Ladies Wear");
                    System.out.println("Enter the number of Items bought");
                    int b = sc.nextInt();
                    System.out.println("Enter the price of the items");
                    int c = sc.nextInt();
                    int d = c*b;
                    System.out.println("City Mart");
                    System.out.println("The Total prize to be paid="+d);
                    System.out.print("Visit again");
                }
                break;
                case 3:
                {
                    System.out.println("Welcome to Designer Wear");
                    System.out.println("Enter the number of Items bought");
                    int b = sc.nextInt();
                    System.out.println("Enter the price of the items");
                    int c = sc.nextInt();
                    int d = c*b;
                    System.out.println("City Mart");
                    System.out.println("The Total prize to be paid="+d);
                    System.out.print("Visit again");
                } 
                break;
                case 4:
                {
                    
                    System.out.println("Welcome to Mens Wear");
                    System.out.println("Enter the number of Items bought");
                    int b = sc.nextInt();
                    System.out.println("Enter the price of the items");
                    int c = sc.nextInt();
                    int d = c*b;
                    System.out.println("City Mart");
                    System.out.println("The Total prize to be paid="+d);
                    System.out.print("Visit again");
                }
                break;
            
                default:
                {
                    System.out.println("Enter a Valid number");
                }
                    break;
            }
        }

        
    }
    

