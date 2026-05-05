public class exploringThestring {
    public static void main(String[] args) {
        String one="i am the don";
        String two="no i am not a don";

        String three= one + two;
          String four = one + two;
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
System.out.println("the lenght of string one will be"+one.length());
System.out.println("the lenght of string one will be"+two.length());
if(one.equals(two)){
    System.out.println("one is equal to two");
}
else{
    System.out.println("one is not eqaul to two");
}
if(three.equals(four)){
    System.out.println("one is equal to two");
}
else{
    System.out.println("three is not eqaul to four");
}
 System.out.println(one.charAt(4));
 System.out.println("i am done with string ");
    String five[]={"one ","two","three","four","five"};
    for(int i=0;i<five.length;i++){
        System.out.println("string ["+i+"] ="+five[i]);
    }

    }
    
}
