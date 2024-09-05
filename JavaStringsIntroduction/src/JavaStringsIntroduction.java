import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();
        String B = in.next();
        int len = A.length() + B.length();
        System.out.println(len);
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String A_Cap = A.substring(0, 1).toUpperCase() + A.substring(1);
        String B_Cap = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(A_Cap + " " + B_Cap);
    }
}
