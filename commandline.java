public class commandline {
    public static void main(String []args){
    System.out.println(args[0]);
    System.out.println(args[1]);
    System.out.println(args[2]);
    System.out.println(args[3]);
    System.out.println(args[4]);
    int i;
    System.out.println("all the element will be printed automatically");
    for( i=0;i<args.length;i++){
        System.out.println(args[i]);
    }
    System.out.println("string-to-int");
    int average=0;
    for( i=0;i<args.length;i++){
        System.out.println(Integer.parseInt(args[i]));
average =average+Integer.parseInt(args[i]);
    }
    System.out.println("the average will be "+(average/(args.length)));
    }
}
