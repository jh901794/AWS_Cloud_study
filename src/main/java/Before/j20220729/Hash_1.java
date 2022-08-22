package Before.j20220729;

import java.util.Hashtable;

public class Hash_1 {
    public static void main(String[] args) {
        //hash : key, value 1:1 �ӵ��� ���� ������
        // key�� ã���� value�� ��ȯ�Ѵ�.

        Hashtable hash = new Hashtable();
        for(int i = 0; i < 5; i++){
            hash.put(i,i);
        }
        for(int i = 0; i < hash.size(); i++){
            System.out.println(hash.get(i));
        }
        hash.clear();

        hash.put("������0","������0");
        hash.put("������1","������1");
        hash.put("������2","������2");

        hash.get("������");
    }
}
