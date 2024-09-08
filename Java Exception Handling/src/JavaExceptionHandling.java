import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        try {
            int x=in.nextInt();
            int y=in.nextInt();
            int z=x/y;
            System.out.println(z);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
