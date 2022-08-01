package j20220801;

import Common.CommonHome;
import java.util.Hashtable;

public class Hash_2 extends CommonHome {
    public static void main(String[] args)  {
        Hashtable hash = new Hashtable();
        for(int i = 0; i < 11; i++){
            hash.put(i,i);
            int h_value = (int)hash.get(i);
            //System.out.println(h_value);
        }
        hash.clear();
        Hash_2 hash_2 = new Hash_2();
        hash_2.setName("김재훈");
        hash_2.setAddress("부산");
        hash_2.setAge(24);
        System.out.println("======================");
        System.out.println(hash_2.getName());
        System.out.println(hash_2.getAddress());
        System.out.println(hash_2.getAge());

        Hash_2 hash_21 = new Hash_2("한산-이순신","부산",20);
        System.out.println("======================");
        System.out.println(hash_21.getName());
        System.out.println(hash_21.getAddress());
        System.out.println(hash_21.getAge());
    }

    public Hash_2(String name, String address, int age) {
        this.setName(name);
        this.setAddress(address);
        this.setAge(age);
    }

    public Hash_2() {
    }
}
