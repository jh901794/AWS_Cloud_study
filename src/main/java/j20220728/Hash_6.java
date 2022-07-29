package j20220728;

import java.util.Hashtable;

public class Hash_6 {
    String name, address;
    public static void main(String[] args) {
        Hash_6 hash = new Hash_6("±Ë¿Á»∆","∫ŒªÍ");
        Hash_6 hash2 = new Hash_6("±Ë¿Á»∆2","∫ŒªÍ2");
        Hashtable table = new Hashtable();
        table.put(1,hash);
        table.put(2,hash2);

        for(int i = 1; i < table.size()+1
                ; i++){

            Hash_6 h_value = (Hash_6) table.get(i);
            System.out.println(h_value.getName());
            System.out.println(h_value.getAddress());

        }

    }

    public Hash_6(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
