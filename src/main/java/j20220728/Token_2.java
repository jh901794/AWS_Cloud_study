package j20220728;

import java.util.StringTokenizer;

public class Token_2 {
    public static void main(String[] args) {
        String home = "������/20/��";
        StringTokenizer token = new StringTokenizer(home,"/");
        while (token.hasMoreTokens()){
            //�̷����ϸ� next�� ��� �ɷ��� ���ݰ� �ȳ��´�.
            //�迭�� �ְ� �����ؾ��ҵ�.
            if(token.nextElement().equals("������")) System.out.println("�̸� �˻�");
        }

    }
}
