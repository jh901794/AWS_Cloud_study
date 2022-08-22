package Before.questionpool;
//�̸� ���� �ּ� �̸��� �ֹι�ȣ ���ڸ�, ���ڸ�
import java.util.ArrayList;
public class List_Question_1 {
    String name, address, num1, num2, email;
    int age;

    public static void main(String[] args) {
        ArrayList<List_Question_1> al = new ArrayList();
        for(int i = 0; i < 3; i++){
            List_Question_1 lq_1 = new List_Question_1("�̸�"+i, "�ּ�"+i, "00101"+i,"12356"+i, "hi"+i+"@naver.com",24);
            al.add(lq_1);
            System.out.println("�̸� : " + al.get(i).getName());
            System.out.println("���� : " + al.get(i).getAge() + "��");
            System.out.println("�ּ� : " + al.get(i).getAddress());
            System.out.println("�̸��� : " + al.get(i).getEmail());
            System.out.println("�ֹε�Ϲ�ȣ : " +al.get(i).getNum1() + "-" + al.get(i).getNum2());
            System.out.println("==================================");
        }
    }

    public List_Question_1(String name, String address, String num1, String num2, String email, int age) {
        this.name = name;
        this.address = address;
        this.num1 = num1;
        this.num2 = num2;
        this.email = email;
        this.age = age;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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
    public String getNum1() {
        return num1;
    }
    public void setNum1(String num1) {
        this.num1 = num1;
    }
    public String getNum2() {
        return num2;
    }
    public void setNum2(String num2) {
        this.num2 = num2;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
