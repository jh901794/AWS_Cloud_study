package Before.j20220803;

public class Static_2 {
    public static  String name = "������";
    public static int age = 25;
    public static String address = "�λ� �쵿";
    public static void main(String[] args) {
        //static : Ŭ������.������ �޼ҵ�
        // ��ü static -> ȣ���� �� �ִ�.
        // Ŭ������(��������).������ �޼ҵ�
        System.out.println(name);
        Static_2 stat = new Static_2("�ƹ���",10,"��");
        System.out.println(stat.getName());
        System.out.println(stat.getAddress());
        System.out.println(stat.getAge());
        setName(name);
        String name = "������1";
        Static_2.name = name;
    }

    public Static_2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Static_2.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Static_2.age = age;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Static_2.address = address;
    }
}
