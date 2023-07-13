public class Foo
{ 
 int i;
 static int s; 
 public static void main(String[] args)
 {
 
 Foo f2 = new Foo(); 
 System.out.println("f2.i is " + f2.i + " f2.s is " + f2.s); 
 
 }
 public Foo() 
 {
 i++; 
 s++;
 }}
