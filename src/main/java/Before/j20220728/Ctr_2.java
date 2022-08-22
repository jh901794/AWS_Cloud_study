package Before.j20220728;

import java.util.ArrayList;

public class Ctr_2 {
    String name;
    String address;
    public static void main(String[] args) {
        ArrayList<Ctr_2> al = new ArrayList<>();
        Ctr_2 ctr_2 = new Ctr_2("�̸�","�ּ�");
        System.out.println(ctr_2.getName());
        System.out.println(ctr_2.getAddress());
        System.out.println("===========================");
        for(int i = 1; i<=5; i++){
            Ctr_2 ctr_21 = new Ctr_2("�̸�"+i,"�ּ�"+i);
            al.add(ctr_21);
            System.out.println(al.get(i-1).getName() + "\t | \t"+al.get(i-1).getAddress());
        }
        System.out.println("===========================");
    }

    public Ctr_2(String name, String address) {
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
