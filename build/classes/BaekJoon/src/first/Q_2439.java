package first;

import java.util.Scanner;

public class Q_2439 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int star = s.nextInt();

        for(int i = 1; i <= star; i++){
            for(int j = 1; j <= star-i; j++){
                System.out.print("x");
            }
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
