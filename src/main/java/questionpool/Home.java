package questionpool;

import java.util.Scanner;

public class Home {
    public String name;
    public int age;
    public String addr;
    public String nick;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Home home = new Home();
        home.setName(sc.next());
        home.setAge(sc.nextInt());
        home.setAddr(sc.next());
        home.setNick(sc.next());

        System.out.println("�̸� = " + home.getName());
        System.out.println("���� = " + home.getAge());
        System.out.println("�ּ� = " + home.getAddr());
        System.out.println("���� = " + home.getNick());
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

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
