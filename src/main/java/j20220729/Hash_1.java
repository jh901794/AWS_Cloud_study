package j20220729;

import java.util.Hashtable;

public class Hash_1 {
    public static void main(String[] args) {
        //hash : key, value 1:1 ¼Óµµ°¡ °¡Àå ºü¸£´Ù
        // key¸¦ Ã£À¸¸é value¸¦ ¹ÝÈ¯ÇÑ´Ù.

        Hashtable hash = new Hashtable();
        for(int i = 0; i < 5; i++){
            hash.put(i,i);
        }
        for(int i = 0; i < hash.size(); i++){
            System.out.println(hash.get(i));
        }
        hash.clear();

        hash.put("±èÀçÈÆ0","±èÀçÈÆ0");
        hash.put("±èÀçÈÆ1","±èÀçÈÆ1");
        hash.put("±èÀçÈÆ2","±èÀçÈÆ2");

        hash.get("±èÀçÈÆ");
    }
}
