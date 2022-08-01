package j20220801;

import java.util.Hashtable;

public class Hash_1 {
    public static void main(String[] args) {
        Hashtable hash = new Hashtable();
        hash.put(1,1);
        hash.put(2,2);
        hash.put(3,3);

        int value = (int)hash.get(1);

        System.out.println(hash.get(1).getClass().getName());
    }
}
