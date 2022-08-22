package Before.j20220728;

import java.util.StringTokenizer;

public class Token_1 {
    public static void main(String[] args) {
        // Token (�ĺ���) ������ ������ ��ȣ.
        // ���ڿ� �迭�� ��� ���
        String home = "������ 24 �λ�";
        StringTokenizer token = new StringTokenizer(home);
        String[] homes = new String[token.countTokens()];
        for(int i =0; token.hasMoreElements(); i++){
            homes[i] = token.nextToken();
            System.out.println(homes[i]);
        }
    }
}
