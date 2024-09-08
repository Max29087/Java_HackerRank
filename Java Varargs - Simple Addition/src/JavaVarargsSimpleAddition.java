import java.util.Scanner;

public class JavaVarargsSimpleAddition {
    public static class Add {
        public void add(int n1, int n2) {
            System.out.println(n1 + "+" + n2 + "=" + (n1 + n2));
        }

        public void add(int n1, int n2, int n3) {
            System.out.println(n1 + "+" + n2 + "+" + n3 + "=" + (n1 + n2 + n3));
        }

        public void add(int n1, int n2, int n3, int n4, int n5) {
            System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "=" + (n1 + n2 + n3 + n4 + n5));
        }

        public void add(int n1, int n2, int n3, int n4, int n5, int n6) {
            System.out.println(n1 + "+" + n2 + "+" + n3 + "+" + n4 + "+" + n5 + "+" + n6 + "=" + (n1 + n2 + n3 + n4 + n5 + n6));
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        int n5 = in.nextInt();
        int n6 = in.nextInt();
        Add a = new Add();
        a.add(n1, n2);
        a.add(n1, n2, n3);
        a.add(n1, n2, n3, n4, n5);
        a.add(n1, n2, n3, n4, n5, n6);
    }
}
