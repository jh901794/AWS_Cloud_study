package first;

import java.util.Scanner;

public class Q_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int sum = 0;

        if( f == s && s == t) {
            sum = 10000 + f * 1000;
        } else if ((f==s && s != t) || (s==t && t!=f) || (f == t && t != s)) {
            sum = 100 +
        }
    }
}
