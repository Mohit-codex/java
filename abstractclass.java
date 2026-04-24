abstract class demo
{
    int x,y;
    abstract void display();
    demo(){
        System.out.println("i am the constructor of the parent class");
    }
}
class demon extends demo{
    int z;
    void display(){
        z=100;
        System.out.println("the value of the z will be :"+z);
    }
        demon(){
            System.out.println("i am the constructor the child class");
        }
    
}

public class abstractclass {
    public static void main(String []args){
        demon m1=new demon();
        m1.display();
    }
}
