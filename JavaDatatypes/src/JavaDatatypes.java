import java.math.BigInteger;
import java.util.Scanner;

public class JavaDatatypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BigInteger[] arr = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextBigInteger();
        }
        BigInteger byteMin = BigInteger.valueOf(Byte.MIN_VALUE);
        BigInteger byteMax = BigInteger.valueOf(Byte.MAX_VALUE);
        BigInteger shortMin = BigInteger.valueOf(Short.MIN_VALUE);
        BigInteger shortMax = BigInteger.valueOf(Short.MAX_VALUE);
        BigInteger intMin = BigInteger.valueOf(Integer.MIN_VALUE);
        BigInteger intMax = BigInteger.valueOf(Integer.MAX_VALUE);
        BigInteger longMin = BigInteger.valueOf(Long.MIN_VALUE);
        BigInteger longMax = BigInteger.valueOf(Long.MAX_VALUE);

        for (int i = 0; i < n; i++) {
            if (arr[i].compareTo(longMax) > 0) {
                System.out.println(arr[i] + " can't be fitted anywhere.");
            } else {
                System.out.println(arr[i] + " can be fitted in:");
                if (arr[i].compareTo(byteMin) >= 0 && arr[i].compareTo(byteMax) <= 0) {
                    System.out.println("* byte");
                }
                if (arr[i].compareTo(shortMin) >= 0 && arr[i].compareTo(shortMax) <= 0) {
                    System.out.println("* short");
                }
                if (arr[i].compareTo(intMin) >= 0 && arr[i].compareTo(intMax) <= 0) {
                    System.out.println("* int");
                }
                if (arr[i].compareTo(longMin) >= 0 && arr[i].compareTo(longMax) <= 0) {
                    System.out.println("* long");
                }
            }

        }
    }
}
