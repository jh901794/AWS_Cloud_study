package Before.j20220729;

import java.util.ArrayList;

public class List_3 {
    String name;
    String address;
    int age;
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        List_3 l3 = new List_3("����", "�λ�", 24);
        arrayList.add(l3);
    }

    public List_3(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
}
