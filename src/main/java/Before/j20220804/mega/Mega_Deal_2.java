package Before.j20220804.mega;

import java.util.Hashtable;

public class Mega_Deal_2 extends Mega_Factory {

    static String[] value = {"������", "24", "�λ�"};
    static BaseMega bm;
    static Hashtable ht = new Hashtable();
    public static void main(String[] args) throws Exception {
        // Arraylist�� Gwang_1~5 new�� Mega�� ��´�.
        // �̸����� �ּҸ� ��Ƽ� for������
        for (int i = 0; i < 5; i++) {
            ht.put(i, Class.forName("Before.j20220804.mega.Gwang_" + (i + 1)).newInstance());
        }
        for (int i = 0; i < ht.size(); i++) {
            Mega_Factory m_f = (Mega_Factory) ht.get(i);
            Setter(m_f,value[0]+i, Integer.parseInt(value[1]),value[2]);
            ht.put(i,m_f);
            bm = (BaseMega) ht.get(i);
            Printing(bm);
        }
    }
}
