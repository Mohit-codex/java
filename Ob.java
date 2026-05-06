class mohit{
int x;
int y;
void fun1(){
    System.out.println("this is a instance function 1");
}
void fun2(){
    System.out.println("this is instance function 2");
}
}
class Ob{

    static void fun1(){
        System.out.println("this is main function 1");
    }
    static void fun2(){
        System.out.println("this is main function 2");
    }
    public static void main( String []args){
        System.out.println("now we are calling static function");
        fun1();
        fun2();
         System.out.println("now we are calling  non-static function");
//now we will object to call instance member function
System.out.println(" we are creating object one ");
mohit m1= new mohit();
m1.x=10;
m1.y=100;
m1.fun1();
m1.fun2();
System.out.println(m1.x);
System.out.println(m1.y);
System.out.println("we are creating object two");
mohit m2=new mohit ();
m2.x=101;
m2.y=102;
System.out.println(m2.x);
System.out.println(m2.y);
    }
}