import java.util.*;
public class t3 {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the n");
    int n=s.nextInt();

    Run R=new Run();
    R.fact(n);
    
    if(R.count==n){
      System.out.println("its ");
    }
    else{System.out.println("its not ");}
    

        
    }
}
class Run{
    double count=0;
    int c=0;
    int r;
    public void fact(int n){
           int n1=n;
           while(n1!=0){
            c++;
            n1=n1/10;  
          }
            while(n!=0){
            r=n%10;
            count = count+Math.pow(r,c); 
            n=n/10;
            }
            
        }
    }

