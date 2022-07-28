package j20220728;
    // class , interface 같은거면 extands 틀리면 implements
    // @Override : 어노테이션 오버라이드 규약
    // 오버라이드는 리턴타입, 메소드명, 인자 개수 및 타입이 같으면 오버라이드가 가능하다.
    // 부모 클래스/인터페이스의 추상메서드를 자식 클래스에서 재정의해 사용하는것을 의미한다.

    // Object : 모든 클래스는 반드시 상속받는다.
    // 클래스는 하나만 받을 수 있다.
    // Object는 생략이 가능하다.
    // Object를 상속받지 않은 것이 Native 클래스이다.

    //모든 클래스는
public class Gwang_1 extends Object implements Mega_1 {
    public static void main(String[] args) {
        Gwang_1 gw = new Gwang_1();
        gw.Print();
        gw.List();

        // mega 안에 gwang이 속해있다.
        // Gwang이 Mega의 자식클래스이기 ?문에 가능하다.
        // 부모클래스로 정의한 메서드는 자식 클래스로 생성하면  Override된 메서드가 출력된다.
        Mega_1 me = new Gwang_1();
        me.Print();
        me.List();

    }

    @Override
    public void Print() {
        System.out.println("광안대교 1반");
    }

    @Override
    public void List() {
        System.out.println("총 5반 있습니다.");
    }
}
