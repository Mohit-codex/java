class parent{
 private int x,y;
 private int p,q;
void putdata(int a ,int b){
    x=a;
    y=b;
}
void displaydata(){
    System.out.println("the value of the x will be :" +x);
    System.out.println("the value of th y will be :"+ y);
}
parent(){
    System.out.println("i am the constructor of parent class");
}
parent(int r,int s){
    p=r;
    q=s;
    System.out.println("the value of the r will be :"+r);
    System.out.println("the value of the s will be :"+s);
}
}
class child extends parent{
int m,n ;

child(int a,int b){
    super(a,b);
    System.out.println("i am the constructor of the child class");
    
}
void displayvalue(){
         System.out.println("this is the function of the child class");
    }
}

public class singleinheritance { 
    public static void main(String [] args){
child ob1=new child(1000,2000);
ob1.putdata(40,50);
ob1.displaydata();
ob1.displayvalue();
    }
}
