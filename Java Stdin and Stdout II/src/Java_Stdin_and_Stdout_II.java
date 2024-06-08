import java.util.Scanner;

public class Java_Stdin_and_Stdout_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        double n2 = input.nextDouble();
        input.nextLine();
        String str = input.nextLine();
        System.out.println("String: " + str + "\n" + "Double: " + n2 + "\n" + "Int: " + n1);
    }
}
