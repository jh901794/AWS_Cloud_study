package first;

import java.util.Scanner;

public class Q_2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        year = sc.nextInt();
        if(year%400 == 0)
        if((year%4 == 0 & year%100 !=0) | year%400 == 0)System.out.print(1);
        else System.out.print(0);
    }
}
