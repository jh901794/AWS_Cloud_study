package first;

import java.util.Scanner;

public class Q_9498 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        score = sc.nextInt();

        if(score < 60){
            System.out.println("F");
        }else if(score < 70){
            System.out.println("D");
        }else if(score < 80){
            System.out.println("C");
        }else if(score < 90){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
    }
}
