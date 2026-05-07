import java.util.Scanner;
class superclass{
    private int x;
    void method1(int a){
        x=a;
        System.out.println("the value of x will be"+x);
        System.out.println("i am a method of super class");
    }
      superclass() {
    System.out.println("this is the constructor of superclass");
}
}
class sub extends superclass{
  public int m ,n;
     void method2(int p,int q){
 m=p;
 n=q;
  super.method1(p);
 System.out.println("m=="+m+"and value of n=="+n);
      
    }
    sub(){
       
System.out.println("this is the constructor of subclass");
    }
}


public class SubvsSup {
    public static void main(String[] args) {
       
        Scanner sb= new Scanner(System.in);
        System.out.println("enter the value of a");
        int a=sb.nextInt();
        System.out.println("enter the value of b");
  int b=sb.nextInt();
  System.out.println("enter your name");
  sb.nextLine();   
  String name=sb.nextLine();
  System.out.println("enter your capital");
  String capital=sb.next();
  System.out.println("the name will be"+name);
   System.out.println("the capital will be"+capital);
        sub objSub=new sub();
        objSub.method2(a,b);
        sb.close();
    }
}
