class demo{
    int x,y;
    demo(){
        System.out.println("constructor is called");
    }
    void putdata(int a,int b){
x=a;
y=b;

    }
    void displaydata(){
System.out.println("the value of x will be :"+ x);
System.out.println("the value of y will be :"+ y);
    }
}

public class Constructor {
    public static void main(String []args){
        demo a1=new demo();
        a1.putdata(47,88);
        a1.displaydata();
    }
}
