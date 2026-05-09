class A{
void showA(){
    System.out.println("this from class a");
}
}
class B extends A{
    void showA(){
    System.out.println("this from class a");
}
}





public class dyanamicmethoddispatch {
    public static void main(String[] args) {
        B ob=new B();
        A m;
        m=ob;
        m.showA();
    }
}
