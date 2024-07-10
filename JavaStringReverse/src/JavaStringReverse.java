import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char ch;
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            r = ch + r;
        }
        if (s.equals(r)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
