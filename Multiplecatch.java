public class Multiplecatch {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5];
            arr[10] = 50;  // ArrayIndexOutOfBoundsException
            

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");

        } catch (Exception e) {
            System.out.println("General exception");
        }
    }
}