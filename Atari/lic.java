import java.util.Scanner;
public class lic
{
    public static void main(String args [])
    {
        System.out.println("Enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter the value");
        int b = sc.nextInt();
        if(b<=100000)
        {
            int c =b*5/100;
            int d =b*2/100;
            int e =c-d;
            System.out.println("Discount="+c);
            System.out.print("Commission ="+d);
            System.out.println("Name"+name);
            System.out.println("Premium="+e);
        } 
        if (b>=100001&&b<=200000) 
        {
            int c =b*8/100;
            int d =b*3/100;
            int e =c-d;
            System.out.println("Discount="+c);
            System.out.print("Commission ="+d);
            System.out.println("Name"+name);
            System.out.println("Premium="+e);
        } 
        if (b>=200001&&b<=500000)
        {
            int c =b*10/100;
            int d =b*5/100;
            int e =c-d;
            System.out.println("Discount="+c);
            System.out.print("Commission ="+d);
            System.out.println("Name"+name);
            System.out.println("Premium="+e);
        }
        if(b>=500000)
        {
            int c =b*15/100;
            double d =b*7.5/100;
            double  e =c-d;
            System.out.println("Discount="+c);
            System.out.print("Commission ="+d);
            System.out.println("Name"+name);
            System.out.println("Premium="+e);
        }

    }

}  