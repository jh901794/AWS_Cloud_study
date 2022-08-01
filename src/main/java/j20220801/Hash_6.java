package j20220801;

import java.util.Enumeration;
import java.util.Hashtable;

public class Hash_6 {
    public static void main(String[] args) {
        Hashtable hash = new Hashtable();
        hash.put("±Ë¿Á»∆", "±Ë¿Á»∆");
        hash.put("±Ë¡ˆ»∆","±Ë¡ˆ»∆");
        hash.put("±Ë¡§»∆", "±Ë¡§»∆");

        Enumeration em = hash.keys();
        while (em.hasMoreElements()){
            String keyvalue = (String)em.nextElement();
            System.out.println(keyvalue);
        }
    }
}
