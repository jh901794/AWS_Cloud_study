package Before.j20220803;

public class Static_1 {
    String name;
    public static String address;
    public int init;
    public static void main(String[] args) {
        // ��ü�� ���ؼ��� ������ �޼ҵ带 ȣ���� �� �ִ�.
        Static_1 static_1 = new Static_1();
        System.out.println(static_1.name);
        // Ŭ������. ����/�޼ҵ�
        // Static�� ��� ��ü�� ������ �ȴ�.

        Static_1.address = "�λ� �쵿";
        System.out.println(address);

        for(int i = 0; i < 5; i++){
            new Static_1();
        }
    }

    public Static_1() {
        System.out.println(++init);
    }
}
