import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        System.out.println("i am going to use ,scanner ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of x: ");
        int x= sc.nextInt();
        System.out.println("enter the value of y: ");
         int y= sc.nextInt();
         System.out.println("enter the value of z: ");
          int z= sc.nextInt();
          System.out.println("the value of x,y,z are respectively "+ x +" " + y +" " + z);
          sc.close();
    }
}
