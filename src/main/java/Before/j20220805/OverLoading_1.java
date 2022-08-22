package Before.j20220805;

public class OverLoading_1 {
    public String name, String;
    public int age;

    // �����ε� : �Լ����� ������ ������ ����, Ÿ�԰� �ٸ����
    public static void main(String[] args) {
        OverLoading_1 overLoading_1 = new OverLoading_1();
    }

    public void Print(){
        System.out.println("print1");
    }
    public void Print(String name){
        System.out.println("print1" + name);
    }
    public void Print(int age){
        System.out.println("print1" + age);
    }
    public void Print(String[] args){
        System.out.println("print1" + args);
    }

    public OverLoading_1() {
        this("������","�λ�");
        System.out.println("�⺻ ������");
    }

    public OverLoading_1(String name, String string, int age) {
        this.name = name;
        String = string;
        this.age = age;
        System.out.println("String name, String string, int age");
    }
    public OverLoading_1(String name, String string) {
        this.name = name;
        String = string;
        System.out.println("String name, String address");
    }

}
