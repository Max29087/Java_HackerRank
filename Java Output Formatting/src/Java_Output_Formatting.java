import java.util.Scanner;

public class Java_Output_Formatting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String c = input.next();
            int n1 = input.nextInt();
            System.out.printf("%-15s%03d%n", c,n1);
        }
        System.out.println("================================");


    }
}
