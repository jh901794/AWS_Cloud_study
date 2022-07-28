package j20220728;

public class Gwang_2 {
    String name;
    int age;
    String address;
    // return할 필요가 없는 경우 void를 사용한다.
    public static void main(String[] args) {
        Gwang_2 gw = new Gwang_2();
        gw.setName("이름");
        gw.setAge(24);
        gw.setAddress("주소");

        System.out.println("이름 : "+gw.getName());
        System.out.println("나이 : "+gw.getAge());
        System.out.println("주소 : "+gw.getAddress());

        Gwang_2 gw2 = new Gwang_2();

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
