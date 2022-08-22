package Before.j20220804;

public class Method_1 {
    //Ŭ���� ����, �ɹ�����,�ɹ� �ʵ�, ��������
    // �ʱ�ȭ �� �ʿ� x
    // ���ڿ��� null, int�� 0

    public String name;
    public int age;
    public String addr;

    public static void main(String[] args) {
        Method_1 me = new Method_1();
        me.setName("������");
        me.setAge(25);
        me.setAddr("�λ�");
        System.out.println(me);

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

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
