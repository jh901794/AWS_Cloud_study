package first;

import java.util.Scanner;

//두 수 비교하기
public class Q1330 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=0,b=0;
        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b){
            System.out.println(">");
        }else if(a<b){
            System.out.println("<");
        }else{
            System.out.println("==");
        }
    }
}
