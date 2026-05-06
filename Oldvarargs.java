public class Oldvarargs {

     static void multipleData(int[] v){
        for(int i=0;i<v.length;i++){
           int  x=v[i];
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int[] one={};
        int[]two={10,12,23,54};
        int[] three={10,21};
        System.out.println("function one is called");
        multipleData(one);
         System.out.println("function two is called");
        multipleData(two);
         System.out.println("function three is called");
        multipleData(three);
    }
}