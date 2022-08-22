package Before.j20220804;

import java.util.Properties;

public class Properties_1 {
    public static void main(String[] args) {
        // \:\=
        Properties p = new Properties();
        // key, value
        // property : ���� << ������ ���� ��.
        // global.properties ó�� ����
        // key-value �� 1��1 �����̶� �˻��� ���� ����.
        for(int i =1; i <= 5; i ++){
            p.put(i, i);
        }
        // list : full index > 0���� max���� ������ �˻��Ѵ�. << ���� �������� �ð��� �����ɸ�
        // list�� �ܼ� ��¶� ���� ���.
        for(int i = 1; i <= p.size(); i++){
            System.out.println(p.get(i));
        }
    }
}
