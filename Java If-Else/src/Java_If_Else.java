import java.util.Scanner;

public class Java_If_Else {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        if (n1 % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n1 <= 5 && n1 >= 2) {
                System.out.println("Not Weird");
            } else if (6 <= n1 && 20 >= n1) {
                System.out.println("Weird");
            } else if (20 < n1) {
                System.out.println("Not Weird");
            }
        }
    }
}
