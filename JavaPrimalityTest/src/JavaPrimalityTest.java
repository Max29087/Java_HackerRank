import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        System.out.println(n.isProbablePrime(50) ? "prime" : "not prime");
        // 50 is a certainty parameter we can also use (10,20,30,40,50). It represents the isProbablePrime() how much accurate;
    }
}
