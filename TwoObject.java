class a{
    int x;// instance memeber variable
    static int  y;
    private static int z;
void fun1(){
    x=10;
    y=20;
    z=30;
}
 void fun2(){
y=40;
z=50;
}
void fun3(){
    System.out.println(z);
     System.out.println(y);
     System.out.println(x);
}

}

// static function can only access static variable

 class TwoObject {
   public  static void main(String []args){
a.y=50;
System.out.println(a.y);

    System.out.println("i am ceating object one");
    a m1=new a();
 m1.x=34;
    m1.fun3();
   
    m1.fun1();
    m1.fun3();
    System.out.println("i am ceating object two");
a m2=new a();
  m2.fun3();
  m2.x=90;
    m2.fun2();
    m2.fun3();
   }
}
