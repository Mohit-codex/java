class mohit{
     static void func1(){
        System.out.println("this is function 1");
    }
 static void  func2(){
        System.out.println("this is function 2");
    }  
}
class Example{
     static void  fun1(){
        System.out.println("this is  manin function 1");
    }
    static  void fun2(){
        System.out.println("this is  manin function 2");
    }
public static void main(String [] args){
    
    System.out.println("this is the main function");
    //  static member can be called directly by using class name
    fun1();
    fun2();
    mohit.func1();
      mohit.func2();

//static class can have static member only
// to call static member function of other class dot is used with class and the function 
   
}


}