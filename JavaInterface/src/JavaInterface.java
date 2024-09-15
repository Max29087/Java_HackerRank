import java.awt.*;
import java.util.Scanner;

public class JavaInterface {
    interface AdvancedArithmetic{
       int divisor_sum(int n);
    }
    public static class MyCalculator implements AdvancedArithmetic{
        public int divisor_sum(int n){
            int sum=0;
            for (int i=1;i<=n/2;i++){
                if (n%i==0){
                    sum+=i;
                }
            }
            System.out.println("I implemented: AdvancedArithmetic");
            return sum+n;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        MyCalculator obj=new MyCalculator();
        System.out.println(obj.divisor_sum(in.nextInt()));
    }
}
