package Before.questionpool;

import Common.CommonHome;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashHome extends CommonHome {
    static Hashtable table = new Hashtable();

    public static void main(String[] args) {
        for(int i = 0; i < 3; i++){
            HashHome home = new HashHome();
            home.setName("�̸�"+i);
            home.setAddress("�ּ�"+i);
            home.setAge(20 + i);
            table.put("�̸�"+i, home);
            System.out.println(home.getName() + "\t" + home.getAddress() + "\t" + home.getAge());
        }
        System.out.println("===========================");
        Enumeration em = table.keys();
        Iterator it = em.asIterator();
        while (em.hasMoreElements()){
            String key_v = (String) em.nextElement();
            HashHome values = (HashHome) table.get(key_v);
            System.out.println(values.getName() + "\t" + values.getAddress() + "\t" + values.getAge());
        }

    }

    public HashHome() {
        super();
    }

    public HashHome(String name, String address, int age) {
        super();
        this.setName(name);
        this.setAddress(address);
        this.setAge(age);

    }
}
