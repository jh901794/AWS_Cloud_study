package j20220727;

import java.util.Arrays;

public class Method_2 {
    public String name;
    public int age;
    public String addr;

    public static void main(String[] args) {
        Method_2 m2 = new Method_2();
        m2.setName("±èÀçÈÆ");
        m2.setAge(24);
        m2.setAddr("ºÎ»ê");

        System.out.println(m2.getName());
        System.out.println(m2.getAge());
        System.out.println(m2.getAddr());

        System.out.println("==========================");

        Method_2 me2 = new Method_2();
        me2.setName("È«±æµ¿");
        me2.setAge(15);
        me2.setAddr("Á¶¼±");

        System.out.println(me2.getName());
        System.out.println(me2.getAge());
        System.out.println(me2.getAddr());

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
}
