import java.util.Scanner;

public class okay

{
    public static void main(String[] args) 
    {
        int a,b,c,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Angle");
        a = sc.nextInt();
        System.out.println("Enter the Second Angle");
        b = sc.nextInt();
        System.out.println("Enter the Third Angl");
        c = sc.nextInt();
        s = a+b+c;
        if (s==180&&a>0&&b>0&&c>0) 
        {
            if(a>90||b>90||c>90)
            System.out.println("The traingle is obtuse-angled");
            else if(a==90||b==90||c==90)
                
                System.out.print("The traingle is right angled traingle ");

                else //if (a<90&&b<90&&c<90);
            
                System.out.println("This a acute-angled triangle");
                
                

        }
        else
        System.out.print("Trangle is not possible");
        

            
        



        
    }

}