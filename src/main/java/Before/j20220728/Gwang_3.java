package Before.j20220728;

public class Gwang_3 {
    String name;
    int init;
    public String getName() {
        return name;
    }

    public Gwang_3() {
        System.out.println(++init);
    }

    //�����ڸ� ����� ���� : �ߺ����� ���� �����ؾ� �ϴ� ��� �ڵ带 ���̱� ���ؼ�
    public Gwang_3(String name) {
        this.name = name;
    }

    public Gwang_3(int init) {
        System.out.println(init);
    }

    public static void main(String[] args) {
        Gwang_3 gw = new Gwang_3("�̸�");
        for(int i = 0; i < 5; i++){
            new Gwang_3(i);
            new Gwang_3();
        }
    }
}
