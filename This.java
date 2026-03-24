class keyword{
    int x,y;
    void putdata(int x,int y){
        this .x=x;
        this.y=y;
    }
    void displayData(){
        System.out.println("the value of x will be :"+x);
        System.out.println("the value of y will be :"+y);
    }
}

class keysword extends keyword
{ 
int x,y;
void putvalue(int x,int y){
        this.x=x;
        this.y=y;
}
void displayvalue(){
        System.out.println("the value of x will be :"+x);
        System.out.println("the value of y will be :"+y);
    }
}

public class This  {
    public static void main(String []args){
keyword m1=new keyword();
m1.putdata(40, 50);
m1.displayData();
keysword m2 =new keysword();
m2.putdata(400, 500);
m2.putvalue(100, 200);
m2.displayData();
m2.displayvalue();
    }
}
