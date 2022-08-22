package Before.j20220801;

public class NullPointerException_1 {
    public static void main(String[] args) {
        // NullPointerException : null���� �ٸ� ������ �ٲܶ�
        // (�ƹ��͵� ���µ� ���� ���Ϸ��� �Ҷ�.

        try {
            String name = "abcdefg";
            name = null;
            // �빮�ڷ� ��ȯ : toUpperCase
            name = name.toUpperCase();

            System.out.println(name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
