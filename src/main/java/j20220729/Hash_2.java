package j20220729;

import java.util.Hashtable;

public class Hash_2 {
    public static void main(String[] args) {
        Hashtable hash = new Hashtable();
        for(int i = 0; i < 5; i++){
            hash.put(i,i);
        }
        for(int i = 0; i < hash.size(); i++){
            System.out.println(hash.get(i));
        }
        hash.clear();
        for(int i = 0; i < 10; i++){
            hash.put(i,i+2);
        }
        System.out.println();
        int sum = 0;
        for(int i = 0; i < hash.size(); i++){
            System.out.println(hash.get(i));
            sum += (int) hash.get(i);
        }
        System.out.println(sum);
    }
}
