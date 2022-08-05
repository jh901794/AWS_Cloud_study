package j20220805.Phone;

public abstract class NewsAgenct_Factory implements SKT, LG, KT{
    // 온라인 : 대리점
    // 오프라인 : 대리점
    // 딜러도 대리점으로 보겠다.
    // new 불가능 : 추상클래스, 인터페이스는 객체 생성 불가능
    // new 는 못해도 생성자는 만들 수 있다.
    // super로 호출한다. 자식이.ㅑ
    // 기능구현은 모두 추상클래스에서 한다.
    // ? abstract 변수명 = new 자식클래스() << 이렇게 new가 가능하다. ?
    // 인터페이스도 위럼 new 가능.
    // 클래스에서는 추상클래스에서 구현된 기능을 상속받아 호출하여 사용하기만 한다.
    public String newsAgency = "SKT";
    @Override
    public void NewsAgency(String newsagency) {
        System.out.println(newsAgency);
    }

    @Override
    public void PersonPhone_Info() {

    }
    public NewsAgenct_Factory() {
    }


}
