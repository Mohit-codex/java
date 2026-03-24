class function1{
    void display(){
        System.out.println("this is function number 1");
    }
}
class function2 extends function1
{
    void display(){
        System.out.println("this is function number 2");
    }
}
public class functionoveriding {
    public static void main(String[]args ){
        function2 m1=new function2();
        // the function of child over rides the function of the parent class 
        m1.display();
        function1 m2=new function1();
        // by using the object of the parent class we are able to get the function of the parent class
        m2.display();
    }
}
