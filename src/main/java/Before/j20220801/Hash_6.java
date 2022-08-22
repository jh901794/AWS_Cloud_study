package Before.j20220801;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash_6 {
    public static void main(String[] args) {
        Hashtable hash = new Hashtable();
        hash.put("������", "������");
        hash.put("������","������");
        hash.put("������", "������");

        Enumeration em = hash.keys();
        while (em.hasMoreElements()){
            String keyvalue = (String)em.nextElement();
            System.out.println(keyvalue);
        }
    }
}
