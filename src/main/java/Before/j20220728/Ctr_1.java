package Before.j20220728;

public class Ctr_1 {

    // Method : �ݵ�� �߰�ȣ�� �ִ�.
    // ������ �迭�� ��ȣ�� ������� �ʴ´�.
    // �޼���� ���� Ÿ���� ���� �� �ִ�.
    // ������ ������ �� ������ �޼��带 ���ؼ� �����δ�.
    // jdbc > mvc1 �𵨷� ����
    String name;
    String address;

    public static void main(String[] args) {
        // new ������ : �޸� �Ҵ� -> ��ü
        //Ctr_1 ctr_1 = new Ctr_1();

        Ctr_1 ctr_1 = new Ctr_1("������", "�ּ�");
        System.out.println(ctr_1.getName() + "\n" + ctr_1.getAddress());
    }

    //���ڰ� �ִ� �����ڰ� ���� �⺻ �����ڴ� ������ �� ����.
    public Ctr_1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //public Ctr_1() {
    //    System.out.println("�⺻ ������ �Դϴ�.");
    //}

}
