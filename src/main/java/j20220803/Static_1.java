package j20220803;

public class Static_1 {
    String name;
    public static String address;
    public int init;
    public static void main(String[] args) {
        // 객체를 통해서만 변수나 메소드를 호출할 수 있다.
        Static_1 static_1 = new Static_1();
        System.out.println(static_1.name);
        // 클래스명. 변수/메소드
        // Static은 모든 객체가 공유가 된다.

        Static_1.address = "부산 우동";
        System.out.println(address);

        for(int i = 0; i < 5; i++){
            new Static_1();
        }
    }

    public Static_1() {
        System.out.println(++init);
    }
}
