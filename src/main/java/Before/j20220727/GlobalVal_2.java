package Before.j20220727;

import Before.questionpool.Gwang_2;

public class GlobalVal_2 {
    //���������� ��� �ʱ�ȭ���� ������ null�� ��ȯ�Ѵ�.
    public String name;
    public int age = 24;
    public String adress = "�ϱ�";

    public static void main(String[] args) {
        GlobalVal_2 g2 = new GlobalVal_2();
        //null ���� ��ȯ�Ҷ�. int�� ��� null ��� 0�� ��ȯ

        String name = null;
        String age = null;
        String address = null;

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println("==============================");
        System.out.println(g2.name);
        System.out.println(g2.age);
        System.out.println(g2.adress);

        System.out.println("���ȴ뱳2 import");

        Gwang_2 gw_2 = new Gwang_2();
        System.out.println(gw_2.name);

        System.out.println(gw_2.name);
        System.out.println(gw_2.age);
        System.out.println(gw_2.adress);
    }
}
