package j20220804;

public class Method_1 {
    //클래스 변수, 맴버변수,맴버 필드, 전역변수
    // 초기화 할 필요 x
    // 문자열은 null, int는 0

    public String name;
    public int age;
    public String addr;

    public static void main(String[] args) {
        Method_1 me = new Method_1();
        me.setName("김재훈");
        me.setAge(25);
        me.setAddr("부산");
        System.out.println(me);

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
