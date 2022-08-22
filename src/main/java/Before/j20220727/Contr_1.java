package Before.j20220727;

public class Contr_1 {
    String name;
    int age;
    String addr;
    String Email;
    public Contr_1(){
        System.out.println("�⺻ ������");
    }

    public Contr_1(String name, int age, String addr, String email) {
        this.name = name;
        this.age = age;
        this.addr = addr;
        Email = email;
    }

    public static void main(String[] args) {
        Contr_1 con = new Contr_1();
        con.setName("������");
        con.setAge(24);
        con.setAddr("�λ�");
        con.setEmail("jh901749@gmail.com");

        System.out.println(con.getName());
        System.out.println(con.getAge());
        System.out.println(con.getAddr());
        System.out.println(con.getEmail());
        System.out.println("===========================================");

        Contr_1 con2 = new Contr_1("�̸�", 10, "�λ�","jh901749@gmail.com");

        System.out.println(con2.getName());
        System.out.println(con2.getAge());
        System.out.println(con2.getAddr());
        System.out.println(con2.getEmail());


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
