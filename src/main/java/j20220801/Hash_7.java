package j20220801;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class Hash_7 {

    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        table.put("±Ë¿Á»∆", "±Ë¿Á»∆");
        table.put("±Ë¡ˆ»∆","±Ë¡ˆ»∆");
        table.put("±Ë¡§»∆", "±Ë¡§»∆");

        Enumeration em = table.keys();
        while (em.hasMoreElements()){
            String keyvalues = (String) em.nextElement();
            String values= (String) table.get(keyvalues);
            System.out.println("key : " + keyvalues + " \t value : " + values);
        }
    }
}
