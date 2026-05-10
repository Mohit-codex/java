class A {
Double dim1;
double dim2;
A(double a,double b){
    dim1=a;
    dim2=b;
}
double Area(){
System.out.println("the area is unidentified:");
return 0;
}
}

class B  extends A{
    B(double a ,double b){
        super(a,b);
    }
double Area(){
System.out.println("the area is rectangle:");
return dim1*dim2;
}
}

class C extends A {
    C(double a ,double b){
        super(a,b);
    }
double Area(){
System.out.println("the area is triangle:");
return dim1*dim2/2;
}
}


public class methodoverriding {
    public static void main(String[] args) {
        A ob1=new A(12, 12);
        B ob2 =new B(10, 10);
        C ob3=new C(64, 64);
        System.out.println("the area will be: "+ob1.Area());
        A p;
        p=ob2;
 System.out.println("the area will be: "+p.Area());
 p=ob3;

System.out.println("the area will be: "+p.Area());
    }
}
