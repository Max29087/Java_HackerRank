import java.util.Scanner;

public class JavaLoops_II {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int[] a;
        a = new int[n1];
        int[] b;
        b = new int[n1];
        int[] c;
        c = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = input.nextInt();
            b[i] = input.nextInt();
            c[i] = input.nextInt();
        }
        for (int k1 = 0; k1 < n1; k1++) {

                    for (int j = 0, x = 0; j < c[k1]; j++) {
                double result = 0;
                for (int k = 0; k < j + 1; k++) {
                    result += (Math.pow(2, k) * b[k1]);
                }
                result = result + a[k1];
                int fresult = (int) result;
                System.out.print(fresult + " ");
            }
            System.out.println();
        }

    }
}
