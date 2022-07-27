package first;

import java.util.Scanner;

public class Q_14681 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=0,y=0;
        x = sc.nextInt();
        y = sc.nextInt();

        if(x > 0){
            if(y>0) System.out.print(1);
            else System.out.print(4);
        }else{
            if(y>0) System.out.print(2);
            else System.out.print(3);
        }
    }
}
