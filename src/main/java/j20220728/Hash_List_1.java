package j20220728;

import Common.CommonHome;

import java.util.ArrayList;
import java.util.Hashtable;

public class Hash_List_1 extends CommonHome {
    public static void main(String[] args) {
/*        Hash_List_1 hash = new Hash_List_1();
        hash.setName("������");
        hash.setAddress("�λ�");
        hash.setAge(24);

        System.out.println(hash.getName());
        System.out.println(hash.getAddress());
        System.out.println(hash.getAge());
*/
        Hash_List_1 hash = new Hash_List_1("������", "�λ�", 25);
        ArrayList al = new ArrayList();
        al.add(hash);
        Hashtable ht = new Hashtable();
        ht.put(1,al);
        // Hash_List_1 > ArrayList > Hashtable ������ ������
        // ����� ��������

        ArrayList a_v = (ArrayList) ht.get(1);
        Hash_List_1 hash_v = (Hash_List_1) a_v.get(0);
        System.out.println(hash_v.getName());
        System.out.println(hash_v.getAddress());
        System.out.println(hash_v.getAge());
    }

    public Hash_List_1(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
