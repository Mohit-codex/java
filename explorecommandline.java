public class explorecommandline {
    public static void main(String []args){
if(args.length==0){
    System.out.println("no input is given");
}
else{
    for(int i=0;i<args.length;i++){
        System.out.println("string ["+i+"]"+args[i]);
    }
}
    }
}
