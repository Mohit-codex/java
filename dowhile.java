import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        char choice;
       do{
        System.out.println("heip on");
        System.out.println("  1.  if");
        System.out.println("  2. switch");
        System.out.println("  3.  while");
        System.out.println("  4. do while");
        System.out.println("  5.  for\n");
        System.out.println("enter the value of the cahr");
       Scanner sc =new Scanner(System.in);
        choice = sc.next().charAt(0);
     System.out.println("\n");
       switch (choice) {
       
             case '1':
            System.out.println("this is my first case");
            break;
             case '2':
            System.out.println("this is my second case");
            break;
             case '3':
            System.out.println("this is my third case");
            break;
        case '4':
            System.out.println("this is my fourth case");
            break;
             case '5':
            System.out.println("this is my fifth case");
            break;
        default:
            System.out.println("the input and the output are wrong");
            break;
       }

        
       }while(choice>='1' || choice<'5');
    
      
    }
}
