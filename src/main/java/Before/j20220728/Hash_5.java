package Before.j20220728;

import java.util.Hashtable;

public class Hash_5 {
    public static void main(String[] args) {
        Hashtable hash = new Hashtable();
        hash.put(1, "������");
        hash.put(2, 30);
        hash.put(3, "�λ�");

        for(int i =1; i < hash.size(); i++){
            String value = "";
            int intvalue = 0;
            String name = hash.get(i).getClass().getName();
            if(name.equals("java.lang.String")){
                value = (String)hash.get(i);
                System.out.println("String : " + value);
            }
            if(name.equals("java.lang.Integer")){
                intvalue = (int)hash.get(i);
                System.out.println("int : " + intvalue);
            }
        }
    }
}
