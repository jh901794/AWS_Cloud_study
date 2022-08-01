package questionpool;

import Common.CommonHome;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashHome extends CommonHome {
    static Hashtable table = new Hashtable();

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            HashHome home = new HashHome();
            home.setName("이름"+i);
            home.setAddress("주소"+i);
            home.setAge(20 + i);
            table.put("이름"+i, home);
            System.out.println(home.getName() + "\t" + home.getAddress() + "\t" + home.getAge());
        }
        System.out.println("===========================");
        Enumeration em = table.keys();
        while (em.hasMoreElements()){
            String key_v = (String) em.nextElement();
            HashHome values = (HashHome) table.get(key_v);
            System.out.println(values.getName() + "\t" + values.getAddress() + "\t" + values.getAge());
        }

    }

    public HashHome() {
    }

    public HashHome(String name, String address, int age) {
        this.setName(name);
        this.setAddress(address);
        this.setAge(age);

    }
}
