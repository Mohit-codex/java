class ABC{
int a,b;
    void fx(int x,int y){
        a=x;
        b=y;

      
    }
     void fx(ABC P){
     a = P.a;
     b=P.b;
    }
     void area(){
        
         System.out.println("area will be :"+ (a*b));
    }
    
}

public class objectparameter {
    public static void main(String[] args) {
       
        ABC m1=new ABC();
        m1.fx(10,20);
        ABC m2=new ABC ();
         m2.fx(m1);
         m1.area();
         m2.area();
       
}
}
