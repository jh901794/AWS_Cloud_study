package Common;

public class CommonHome {
    // public : ������ ����
    // private : �� Ŭ������
    private String name, address;
    private int age;

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

    public static void main(String[] args) {
        CommonHome comm = new CommonHome();
        System.out.println(comm.name = "������");
        System.out.println(comm.address = "�λ�");
        System.out.println(comm.age = 24);
    }
}
