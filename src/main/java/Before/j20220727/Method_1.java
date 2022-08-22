package Before.j20220727;

public class Method_1 {
    // ������ ������ �� ����.
    // ������ ����� �ȵȴ�.
    // �޼���� ������Ѵ�.
    public String name;
    public int age;
    public String adress;

    public static void main(String[] args) {
        Method_1 me = new Method_1();

        System.out.println(me.getName());
        me.setName("������");
        System.out.println(me.getName());
    }


    //Method(�Լ�) : ���������� Ÿ�� �޼�����
    //get, set, add ����, ����, ����
    //this�� �Ϲ������� ��������.
    //���������� ���������� �̸��� ���� ��� ������ �� ����.
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
