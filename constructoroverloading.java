class fx{

     fx(){
        System.out.println("constructor one");
        System.out.println("volume will be:");
    }
      fx(int a,int b){
        System.out.println("constructor two");
         System.out.println("volume will be :"+(a*b*a));
    }
      fx(int a){
        System.out.println("constructor three");
         System.out.println("volume will be :"+ (a*a*a));
    }
     fx(double a){
        System.out.println("constructor four");
         System.out.println("volume will be :"+(a*a*a));
    }
}




public class constructoroverloading {
   public static void main(String[] args) {
        fx m1=new fx();
        fx m2=new fx(10,29);
        fx m3=new fx(29.20);
        fx m4=new fx(40);
        
}
}
