class ABC{

    void fx(){
        System.out.println("function one");
        System.out.println("volume will be:");
    }
     void fx(int a,int b){
        System.out.println("functin two");
         System.out.println("volume will be :"+(a*b*a));
    }
     void fx(int a){
        System.out.println("function three");
         System.out.println("volume will be :"+ (a*a*a));
    }
     void fx(double a){
        System.out.println("function four");
         System.out.println("volume will be :"+(a*a*a));
    }
}




public class functionoverloading {
    public static void main(String[] args) {
        ABC m1=new ABC();
        m1.fx();
        m1.fx(29.8);
        m1.fx(12);
        m1.fx(12,10);
    }
}
