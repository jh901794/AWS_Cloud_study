package Before.parent_child;
// �߻�Ŭ������ �������̽��� ��ӹ����� ��ü������ ������ �ʾƵ� �ȴ�.
// abstract << �߻�
// new ��ü ������ �ȵȴ�. ��ü�� ������ �����ڸ� ����� �� ����.

public abstract class Mega_Factory_1 implements Mega_1{

    //���� Ÿ�� �޼ҵ��, ���ڰ��� ����Ÿ���� ������ Override
    @Override
    public void Gwang_1() {
        System.out.println("���ȴ뱳 1��");
    }

    @Override
    public void Gwang_2() {
        System.out.println("���ȴ뱳 2��");
    }

    @Override
    public void Gwang_3() {
        System.out.println("���ȴ뱳 3��");
    }

    @Override
    public void Gwang_4() {
        System.out.println("���ȴ뱳 4��");
    }

    @Override
    public void Gwang_5() {
        System.out.println("���ȴ뱳 5��");
    }
}
