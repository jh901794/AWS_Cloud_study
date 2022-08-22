package Before.j20220728;
    // class , interface �����Ÿ� extands Ʋ���� implements
    // @Override : ������̼� �������̵� �Ծ�
    // �������̵�� ����Ÿ��, �޼ҵ��, ���� ���� �� Ÿ���� ������ �������̵尡 �����ϴ�.
    // �θ� Ŭ����/�������̽��� �߻�޼��带 �ڽ� Ŭ�������� �������� ����ϴ°��� �ǹ��Ѵ�.

    // Object : ��� Ŭ������ �ݵ�� ��ӹ޴´�.
    // Ŭ������ �ϳ��� ���� �� �ִ�.
    // Object�� ������ �����ϴ�.
    // Object�� ��ӹ��� ���� ���� Native Ŭ�����̴�.

    //��� Ŭ������
public class Gwang_1 extends Object implements Mega_1 {
    public static void main(String[] args) {
        Gwang_1 gw = new Gwang_1();
        gw.Print();
        gw.List();

        // mega �ȿ� gwang�� �����ִ�.
        // Gwang�� Mega�� �ڽ�Ŭ�����̱� ?���� �����ϴ�.
        // �θ�Ŭ������ ������ �޼���� �ڽ� Ŭ������ �����ϸ�  Override�� �޼��尡 ��µȴ�.
        Mega_1 me = new Gwang_1();
        me.Print();
        me.List();

    }

    @Override
    public void Print() {
        System.out.println("���ȴ뱳 1��");
    }

    @Override
    public void List() {
        System.out.println("�� 5�� �ֽ��ϴ�.");
    }
}
