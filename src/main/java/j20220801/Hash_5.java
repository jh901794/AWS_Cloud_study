package j20220801;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class Hash_5 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put(1,1);
        hashtable.put(2,2);
        hashtable.put(3,3);

        for(int i =1; i <= hashtable.size(); i++){
            int invalue = (Integer) hashtable.get(i);
            System.out.println(hashtable.get(i));
        }
        hashtable.clear();

        hashtable.put(1,"±èÀçÈÆ");
        hashtable.put(2,"È«±æµ¿");
        for(int i =1; i <= hashtable.size(); i++){
            String strvalue = (String) hashtable.get(i);
            System.out.println(hashtable.get(i));
        }

        System.out.println("=========================");
        hashtable.values();
        Collection coll = hashtable.values();
        Iterator it = coll.iterator();

        while(it.hasNext()){
            String value = (String) it.next();
            System.out.println(value);
        }
    }
}
