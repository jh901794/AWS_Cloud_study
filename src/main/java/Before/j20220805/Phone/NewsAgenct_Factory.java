package Before.j20220805.Phone;

public abstract class NewsAgenct_Factory implements SKT, LG, KT{
    // �¶��� : �븮��
    // �������� : �븮��
    // ������ �븮������ ���ڴ�.
    // new �Ұ��� : �߻�Ŭ����, �������̽��� ��ü ���� �Ұ���
    // new �� ���ص� �����ڴ� ���� �� �ִ�.
    // super�� ȣ���Ѵ�. �ڽ���.��
    // ��ɱ����� ��� �߻�Ŭ�������� �Ѵ�.
    // ? abstract ������ = new �ڽ�Ŭ����() << �̷��� new�� �����ϴ�. ?
    // �������̽��� ���� new ����.
    // Ŭ���������� �߻�Ŭ�������� ������ ����� ��ӹ޾� ȣ���Ͽ� ����ϱ⸸ �Ѵ�.
    public String newsAgency = "SKT";
    @Override
    public void NewsAgency(String newsagency) {
        System.out.println(newsAgency);
    }

    @Override
    public void PersonPhone_Info() {

    }
    public NewsAgenct_Factory() {
    }


}
