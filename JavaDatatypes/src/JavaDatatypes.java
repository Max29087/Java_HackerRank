import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        long x;
        n = in.nextInt();
        for (int i = 0; i < n; i++) {
            try {
                x = in.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x <= Byte.MAX_VALUE && x >= Byte.MIN_VALUE) {
                    System.out.println("* byte");
                }
                if (x <= Short.MAX_VALUE && x >= Short.MIN_VALUE) {
                    System.out.println("* short");
                }
                if (x <= Integer.MAX_VALUE && x >= Integer.MIN_VALUE) {
                    System.out.println("* int");
                }
                if (x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(in.next()+" can't be fitted anywhere.");
            }

        }
    }
}