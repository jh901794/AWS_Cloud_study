package first;

import java.util.Locale;
import java.util.Scanner;

public class Q_1264 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(;;) {
            String sen = s.nextLine();
            int count = 0;
            if(sen.equals("#")) {
                break;
            }
            sen = sen.toLowerCase();
            for (int i = 0; i < sen.length(); i++) {
                switch (sen.charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        count++;
                    default:
                        break;
                }
            }
            System.out.println(count);
        }
    }
}
