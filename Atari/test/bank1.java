package test;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class bank1 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Bank account");
        //test bank acc and pass = acc 1 - 9876543 pass- 9874
        //acc 2 - 8989898 pass- 1890
        int a,b,c,d,e;
        a = sc.nextInt();
        if(a==8989898||a==9876543);
       {
            
           System.out.println("Press 1 to access the savings account");
          System.out.println("Press 2 to access the savings account");
           System.out.println("Press 3 to exit");
           int ab =sc.nextInt();
        

           switch (ab) 
          {
            case 1:
            {
                System.out.println("Enter the password");
                b = sc.nextInt();
                if (b==9874) // first acc
                {
                    System.out.println("Press 1 to view balance");
                    System.out.println("Press 2 to deposit");
                    System.out.println("Press 3 to withdraw money");
                    System.out.println("Press 4 to Exit");
                    d = 100000; //initial balance
                    c = sc.nextInt();
                    switch (c) {
                        case 1:
                        {
                            
                            System.out.println("The Balance is:"+d);
                        }
                            
                            break;
                         case 2:
                         {
                             System.out.println("Enter the amount to be deposited");
                             e=sc.nextInt();
                             int f = d+e;
                             System.out.println("The total amount after deposition is :"+f);
    
    
                         }
                         case 3:
                         {
                            System.out.println("Enter the amount to be withdrawn");
                            e=sc.nextInt();
                            int f = d-e;
                            if (f<0) 
                            {
                                System.out.println("The amount entered is too much:");
    
                                
                            }
                            else
                            {
                                System.out.println("The money withdrawn;amount after money withdrawn="+f);
                            }
    
                         }
                         case 4:
                         {
                             System.out.println("Restart the program idk how to do it");
    
                         }
    
                    
                        default:
                        System.out.println("Enter a valid number");
                            break;
                    }
                    if (b==1890) 
                    {
                        {
                            System.out.println("Press 1 to view balance");
                            System.out.println("Press 2 to deposit");
                            System.out.println("Press 3 to withdraw money");
                            System.out.println("Press 4 to Exit");
                            d = 100000; //initial balance
                            c = sc.nextInt();
                            switch (c) {
                                case 1:
                                {
                                    
                                    System.out.println("The Balance is:"+d);
                                }
                                    
                                    break;
                                 case 2:
                                 {
                                     System.out.println("Enter the amount to be deposited");
                                     e=sc.nextInt();
                                     int f = d+e;
                                     System.out.println("The total amount after deposition is :"+f);
            
            
                                 }
                                 case 3:
                                 {
                                    System.out.println("Enter the amount to be withdrawn");
                                    e=sc.nextInt();
                                    int f = d-e;
                                    if (f<0) 
                                    {
                                        System.out.println("The amount entered is too much:");
            
                                        
                                    }
                                    else
                                    {
                                        System.out.println("The money withdrawn;amount after money withdrawn="+f);
                                    }
            
                                 }
                                 case 4:
                                 {
                                     System.out.println("Restart the program idk how to do it");
            
                                 }
            
                            
                                default:
                                System.out.println("Enter a valid number");
                                    break;
                                }  
                        }
                    }
                }
            }
            break;
            case 2:
            {
                System.out.println("Enter the password");
                b = sc.nextInt();
                if (b==9874) // first acc
                {
                    System.out.println("Press 1 to view balance");
                    System.out.println("Press 2 to deposit");
                    System.out.println("Press 3 to withdraw money");
                    System.out.println("Press 4 to Exit");
                    d = 100000; //initial balance
                    c = sc.nextInt();
                    switch (c) {
                        case 1:
                        {
                            
                            System.out.println("The Balance is:"+d);
                        }
                            
                            break;
                         case 2:
                         {
                             System.out.println("Enter the amount to be deposited");
                             e=sc.nextInt();
                             int f = d+e;
                             System.out.println("The total amount after deposition is :"+f);
    
    
                         }
                         case 3:
                         {
                            System.out.println("Enter the amount to be withdrawn");
                            e=sc.nextInt();
                            int f = d-e;
                            if (f<0) 
                            {
                                System.out.println("The amount entered is too much:");
    
                                
                            }
                            else
                            {
                                System.out.println("The money withdrawn;amount after money withdrawn="+f);
                            }
    
                         }
                         case 4:
                         {
                             System.out.println("Restart the program idk how to do it");
    
                         }
    
                    
                        default:
                        System.out.println("Enter a valid number");
                            break;
                    }
                    if (b==1890) 
                    {
                        {
                            System.out.println("Press 1 to view balance");
                            System.out.println("Press 2 to deposit");
                            System.out.println("Press 3 to withdraw money");
                            System.out.println("Press 4 to Exit");
                            d = 100000; //initial balance
                            c = sc.nextInt();
                            switch (c) {
                                case 1:
                                {
                                    
                                    System.out.println("The Balance is:"+d);
                                }
                                    
                                    break;
                                 case 2:
                                 {
                                     System.out.println("Enter the amount to be deposited");
                                     e=sc.nextInt();
                                     int f = d+e;
                                     System.out.println("The total amount after deposition is :"+f);
            
            
                                 }
                                 case 3:
                                 {
                                    System.out.println("Enter the amount to be withdrawn");
                                    e=sc.nextInt();
                                    int f = d-e;
                                    if (f<0) 
                                    {
                                        System.out.println("The amount entered is too much:");
            
                                        
                                    }
                                    else
                                    {
                                        System.out.println("The money withdrawn;amount after money withdrawn="+f);
                                    }
            
                                 }
                                 case 4:
                                 {
                                     System.out.println("Restart the program idk how to do it");
            
                                 }
            
                            
                                default:
                                System.out.println("Enter a valid number");
                                    break;
                                }  
                        }
                    }
                }
            }
            break;
            case 3:
            {
                System.out.println("Enter the password");
                b = sc.nextInt();
                if (b==9874) // first acc
                {
                    System.out.println("Press 1 to view balance");
                    System.out.println("Press 2 to deposit");
                    System.out.println("Press 3 to withdraw money");
                    System.out.println("Press 4 to Exit");
                    d = 100000; //initial balance
                    c = sc.nextInt();
                    switch (c) {
                        case 1:
                        {
                            
                            System.out.println("The Balance is:"+d);
                        }
                            
                            break;
                         case 2:
                         {
                             System.out.println("Enter the amount to be deposited");
                             e=sc.nextInt();
                             int f = d+e;
                             System.out.println("The total amount after deposition is :"+f);
    
    
                         }
                         case 3:
                         {
                            System.out.println("Enter the amount to be withdrawn");
                            e=sc.nextInt();
                            int f = d-e;
                            if (f<0) 
                            {
                                System.out.println("The amount entered is too much:");
    
                                
                            }
                            else
                            {
                                System.out.println("The money withdrawn;amount after money withdrawn="+f);
                            }
    
                         }
                         case 4:
                         {
                             System.out.println("Restart the program idk how to do it");
    
                         }
    
                    
                        default:
                        System.out.println("Enter a valid number");
                            break;
                    }
                    if (b==1890) 
                    {
                        {
                            System.out.println("Press 1 to view balance");
                            System.out.println("Press 2 to deposit");
                            System.out.println("Press 3 to withdraw money");
                            System.out.println("Press 4 to Exit");
                            d = 100000; //initial balance
                            c = sc.nextInt();
                            switch (c) {
                                case 1:
                                {
                                    
                                    System.out.println("The Balance is:"+d);
                                }
                                    
                                    break;
                                 case 2:
                                 {
                                     System.out.println("Enter the amount to be deposited");
                                     e=sc.nextInt();
                                     int f = d+e;
                                     System.out.println("The total amount after deposition is :"+f);
            
            
                                 }
                                 case 3:
                                 {
                                    System.out.println("Enter the amount to be withdrawn");
                                    e=sc.nextInt();
                                    int f = d-e;
                                    if (f<0) 
                                    {
                                        System.out.println("The amount entered is too much:");
            
                                        
                                    }
                                    else
                                    {
                                        System.out.println("The money withdrawn;amount after money withdrawn="+f);
                                    }
            
                                 }
                                 case 4:
                                 {
                                     System.out.println("Restart the program idk how to do it");
            
                                 }
            
                            
                                  default:
                                  System.out.println("Enter a valid number");
                                    break;
                                 }  
                              }
                           }
                        }
                    }
           
     
                     
                    default:
                 } 
                      System.out.println("Enter a valid option");
                }
            }
        
        
                      
            
        
      
      
        }
   
    }
   
    
   
    
}

        