package Before.j20220729;

import java.util.Hashtable;

public class Hash_3 {
    String name, address, num1, num2;
    int age;
    public static void main(String[] args) {
        /*
        key Object < ��� Ÿ���� �� �� �ִ�.
        class �θ� object < ��� Ÿ���� object�� ���� �� �ִ�.
         */
        Hashtable hash = new Hashtable();
        hash.put("������","������");
        hash.put(1,1);
        hash.clear();
        //���� Ŭ����
        for(int i = 0; i < 3; i++){
            hash.put(i,new Hash_3("�̸�"+i,"�λ�", "00000"+i,"000000"+i,25));
        }

        for(int i =0; i < hash.size(); i++){
            Hash_3 hash_v = (Hash_3) hash.get(i);
            System.out.println("�̸� : " + hash_v.getName());
            System.out.println("���� : " + hash_v.getAge() + "��");
            System.out.println("�ּ� : " + hash_v.getAddress());
            System.out.println("�ֹε�Ϲ�ȣ : " +hash_v.getNum1() + "-" + hash_v.getNum2());
            System.out.println("==================================");
        }

    }

    public Hash_3(String name, String address, String num1, String num2, int age) {
        this.name = name;
        this.address = address;
        this.num1 = num1;
        this.num2 = num2;
        this.age = age;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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


