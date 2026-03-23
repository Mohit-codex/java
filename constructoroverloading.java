class demo{
    int x,y;
    demo(){
System.out.println("constructor is  called");
    }
    demo(int p,int q){
        x=p;
        y=q;
    }
    void display(){
        System.out.println("the value of a will :"+ x);
        System.out.println("the value of b will be  :"+y);
    }
}



public class constructoroverloading{
public static void main(String[]args ){
    demo a1=new demo();
      demo a2=new demo(12,24);
      demo a3 =new demo(33,44);
       a1.display();
      a2.display();
 a3.display();
}
}