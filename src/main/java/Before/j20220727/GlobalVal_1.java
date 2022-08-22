package Before.j20220727;

public class GlobalVal_1 {
    public String g_name = "������";
    public int g_age = 24;
    public String g_adress = "�ϱ�";
    // ��������, Ŭ���� ����, �ʵ庯�� (API)
    // ���� ������ Ÿ�� �������� ����
    // ���� ������
    // public    : ��ü ���� ����
    // protected : �ش� ��Ű����
    // private   : ���� Ŭ����
    public static void main(String[] args) {
         String name = "������";
         int age = 24;
         String adress = "�ϱ�";
        //��ü ���� : ū������ ���������ΰ���.
        // java���� �θ�� �ڽ����� ���� ��ū�� ���ٿ����� '.'

        //new : �޸𸮿� �ø���.
        GlobalVal_1 g_1 = new GlobalVal_1();
        System.out.println("����");
        System.out.println("���� �̸� : " + g_1.g_name);
        System.out.println("���� ���� : " + g_1.g_age);
        System.out.println("���� �ּ� : " + g_1.g_adress);
        System.out.println("===========================");

        System.out.println("����");
        System.out.println("���� �̸� : " + name);
        System.out.println("���� ���� : " + age);
        System.out.println("���� �ּ� : " + adress);
    }
}
