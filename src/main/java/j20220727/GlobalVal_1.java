package j20220727;

public class GlobalVal_1 {
    public String g_name = "김재훈";
    public int g_age = 24;
    public String g_adress = "북구";
    // 전역변수, 클래스 변수, 필드변수 (API)
    // 접근 제한자 타입 변수명의 형태
    // 접근 제한자
    // public    : 전체 접근 가능
    // protected : 해당 패키지만
    // private   : 현재 클래스
    public static void main(String[] args) {
         String name = "김재훈";
         int age = 24;
         String adress = "북구";
        //객체 지향 : 큰곳에서 작은곳으로간다.
        // java에서 부모와 자식으로 가는 토큰은 접근연산자 '.'

        //new : 메모리에 올린다.
        GlobalVal_1 g_1 = new GlobalVal_1();
        System.out.println("전역");
        System.out.println("전역 이름 : " + g_1.g_name);
        System.out.println("전역 나이 : " + g_1.g_age);
        System.out.println("전역 주소 : " + g_1.g_adress);
        System.out.println("===========================");

        System.out.println("지역");
        System.out.println("지역 이름 : " + name);
        System.out.println("지역 나이 : " + age);
        System.out.println("지역 주소 : " + adress);
    }
}
