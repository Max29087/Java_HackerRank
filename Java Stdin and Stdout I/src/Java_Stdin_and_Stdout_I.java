import java.util.Scanner;

public class Java_Stdin_and_Stdout_I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        input.close();
        System.out.println(n1 + "\n" + n2 + "\n" + n3);
    }
}
