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
  public int a ,b;
     void method2(int a ,int b){
 
        System.out.println("i am a method of super class");
    }
    sub(){
        super();
System.out.println("this is the constructor of subclass");
    }
}


public class SubvsSup {
    public static void main(String[] args) {
        sub objSub=new sub();
    }
}
