import java.util.*;
public class JavaStaticInitializerBlock {
    Scanner input = new Scanner(System.in);
    static int B, H;
    static boolean flag = true;

    static {
        Scanner input = new Scanner(System.in);
        B = input.nextInt();
        H = input.nextInt();
        if (B <= 0 || H <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

}

