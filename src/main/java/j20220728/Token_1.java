package j20220728;

import java.util.StringTokenizer;

public class Token_1 {
    public static void main(String[] args) {
        // Token (식별자) 구분이 가능한 기호.
        // 문자열 배열에 담고 출력
        String home = "김재훈 24 부산";
        StringTokenizer token = new StringTokenizer(home);
        String[] homes = new String[token.countTokens()];
        for(int i =0; token.hasMoreElements(); i++){
            homes[i] = token.nextToken();
            System.out.println(homes[i]);
        }
    }
}
