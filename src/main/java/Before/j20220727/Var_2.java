package Before.j20220727;

import java.util.Scanner;
public class Var_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        System.out.print("현재 나이를 입력하세요 : ");
        age = sc.nextInt();
        System.out.println();
        age = age +10 -10 +20 -20;
        System.out.println("계산된 나이는  : " + age);
    }
}
