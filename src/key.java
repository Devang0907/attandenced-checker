import java.util.*;

public class key {

    
        public static void main(String args[]){ 
            
        int flag=0;
        Scanner s =new Scanner(System.in);
        int r=s.next1+Int();

        int a[]= new int[5];

        for(int i=0;i<a.length;i++)
        { a[i]=s.nextInt();}

         for(int i=0;i<a.length;i++)
         {if (a[i]==r)
           {System.out.println(i);
            flag=1;  }}
          if(flag==0){System.out.println("no. not found in array");}
        }
 }
    

    

