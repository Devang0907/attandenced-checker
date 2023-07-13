import java.util.*;
class dev
 {
 public static void main(String[] args)
 { Scanner sc=new Scanner(System.in);
    System.out.println("enter the n1");
    int n1=sc.nextInt();
    System.out.println("enter the n2");
    int n2=sc.nextInt();

   Run R=new Run();
   int f=R.fact(n1,n2);
   System.out.println(f);
 
 
 }
}
class Run{
   
     int fact(int num1,int num2){
           
           
          
         
          if (num2==0 )
              {return num1;}
            
        else
            {return fact(num2, num1%num2);}
          
         
      }
           }
            
            
    
    


