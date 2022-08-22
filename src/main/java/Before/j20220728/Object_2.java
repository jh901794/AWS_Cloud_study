package Before.j20220728;

public class Object_2 extends Object{
    public static void main(String[] args) {
        String name = "����";
        System.out.println(name);

        Object name2 = "����";
        System.out.println(name2.getClass().getName());

        // Wrapper class
        // �ݵ�� ��ü�� static�� ���ؼ��� ������ �޼��� ȣ���� �����ϴ�.
        // String���� Int�� �����ϴ� ����ȯ
        // static : class��.���� Ŭ������. �޼��� ��

        // ���� ĳ���� ����ȯ.
        int age = 20;

        Integer age2 = 30;

        int age3 = age2.parseInt("30");

        System.out.println(age3);

        age3 += 10;
        System.out.println(age3);

        String name3 = String.valueOf(age);
        System.out.println(name3.getClass().getName());
    }
}
