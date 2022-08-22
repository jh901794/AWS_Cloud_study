package Before.j20220729;

import java.util.ArrayList;

public class ArrayList_2 {
    String name;
    String address;
    int age;

    public static void main(String[] args) {
        ArrayList_2 Al2 = new ArrayList_2();
        Al2.setName("������");
        Al2.setAddress("�λ�");
        Al2.setAge(24);

        ArrayList<ArrayList_2> al = new ArrayList();
        al.add(Al2);

        // �ƹ�ư String���� ��ȯ�ϱ� ���ؼ��� Strign.valueOf�� ����ϸ� �ȴ�.
        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i).getName() + "\t " + al.get(i).getAddress() + "\t " + al.get(i).getAge());
        }
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
