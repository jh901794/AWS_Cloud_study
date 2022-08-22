package Before.j20220728;

public class Gwang_2 {
    String name;
    int age;
    String address;
    // return�� �ʿ䰡 ���� ��� void�� ����Ѵ�.
    public static void main(String[] args) {
        Gwang_2 gw = new Gwang_2();
        gw.setName("�̸�");
        gw.setAge(24);
        gw.setAddress("�ּ�");

        System.out.println("�̸� : "+gw.getName());
        System.out.println("���� : "+gw.getAge());
        System.out.println("�ּ� : "+gw.getAddress());

        Gwang_2 gw2 = new Gwang_2();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
