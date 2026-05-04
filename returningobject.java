class test{
    int a;
    test(int i){
        a=i;
    }
test incrByTen(){
test temp=new test(a+10);
return temp;
}
}



public class returningobject {
    public static void main(String[] args) {
        test ob1=new test(2);
test ob2;
ob2=ob1.incrByTen();
System.out.println("the value of the ob1 will be"+ob1.a);
System.out.println("the value of the ob2 will be"+ob2.a);
ob2=ob2.incrByTen();
System.out.println("the value of the ob2 will be"+ob2.a);
    }
}
