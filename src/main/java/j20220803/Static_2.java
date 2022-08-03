package j20220803;

public class Static_2 {
    public static  String name = "김재훈";
    public static int age = 25;
    public static String address = "부산 우동";
    public static void main(String[] args) {
        //static : 클래스명.변수나 메소드
        // 객체 static -> 호출할 수 있다.
        // 클래스명(생략가능).변수나 메소드
        System.out.println(name);
        Static_2 stat = new Static_2("아무개",10,"집");
        System.out.println(stat.getName());
        System.out.println(stat.getAddress());
        System.out.println(stat.getAge());
        setName(name);
        String name = "김재훈1";
        Static_2.name = name;
    }

    public Static_2(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Static_2.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Static_2.age = age;
    }

    public static String getAddress() {
        return address;
    }

    public static void setAddress(String address) {
        Static_2.address = address;
    }
}
