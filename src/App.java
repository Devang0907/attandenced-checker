import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
       
     int a,b;
     Scanner p=new Scanner(System.in);
      System.out.println("enter no. of total lacture");
      a=p.nextInt();
      System.out.println("enter no. of attend lacture");
      b=p.nextInt();
       
      double t=(b*100)/a;
      if (t>=75)
           System.out.println("you are allowed to sit in exam.");
      else
           System.out.println("you are on leave due to medical reason?  if yes press 'y'");
           char r=p.next().charAt(0);
           if (r=='y')
             System.out.println("you can attend exam.");
           else
             System.out.println("sorry, you can not attend exam.");   

           
          
        





    }
}
