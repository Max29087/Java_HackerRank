import java.util.*;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n1, n2;
        n1 = in.nextInt();
        n2 = in.nextInt();
        System.out.println(s.substring(n1, n2));
    }
}
