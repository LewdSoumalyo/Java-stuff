package test;
import java.util.Scanner;
public class triangle 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides");
        int a,b,c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int s = a+b+c;
        if(s==180&&a>0&&b>0&&c>0)
        {
            if (a<90&&b<90&&c<90)
            
            System.out.println("The triangle is an acute triangle");
            else if(a==90||b==90||c==90)
            System.out.println("Right angled traingle");
            else
            System.out.println("Obtuse angled triangle");
             
            
        }
        else
        System.out.println("Triangle not possible");
        
    }


}