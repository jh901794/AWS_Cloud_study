package first;

import java.math.BigInteger;
import java.util.Scanner;
public class Q_1271 {
    public static void main(String[] args) {
        BigInteger n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextBigInteger();
        m = sc.nextBigInteger();
        System.out.println(m.divide(n));
        System.out.println(m.remainder(n));
    }
}
