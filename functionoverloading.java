class function{
    private int x,y ,z;
    void putdata(){
        System.out.println("this is empty fuction");
    }
    void putdata(int x){
        this.x=x;
        System.out.println("the value of the x will be :"+x);
    }
      void putdata(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("the value of the x will be :"+x);
        System.out.println("the value of the y will be :"+y);
    }
     void putdata(int x,int y,int z){
        this.x=x;
        this.y=y;
        this.z=z;
        System.out.println("the value of the x will be :"+x);
        System.out.println("the value of the y will be :"+y);
          System.out.println("the value of the z will be :"+z);
    }
}

public class functionoverloading {
    public static void main(String []args){
function m1=new function();
m1.putdata();
m1.putdata(10,20,30);
m1.putdata(100,200);
m1.putdata(10);
    }
}
