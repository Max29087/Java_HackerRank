import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();
        BigInteger sum = A.add(B);
        BigInteger product = A.multiply(B);
        System.out.println(sum);
        System.out.println(product);
    }

}
