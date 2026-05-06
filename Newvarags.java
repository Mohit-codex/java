public class Newvarags {
     static void multipleData(int... v){
        for(int i=0;i<v.length;i++){
           int  x=v[i];
            System.out.println(x);
        }
    }
     public static void main(String[] var0) {
      
      System.out.println("function one is called");
      multipleData();
      System.out.println("function two is called");
      multipleData(10,20,30,40);
      System.out.println("function three is called");
      multipleData(100,200,300,4000,500);
   }
}
