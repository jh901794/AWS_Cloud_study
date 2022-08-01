package parent_child;
// 추상클래스는 인터페이스를 상속받으면 몸체구현을 해주지 않아도 된다.
// abstract << 추상
// new 객체 생성이 안된다. 몸체가 없으니 생성자를 사용할 수 없다.

public abstract class Mega_Factory_1 implements Mega_1{

    //리턴 타입 메소드명, 인자갯수 인자타입이 같으면 Override
    @Override
    public void Gwang_1() {
        System.out.println("광안대교 1반");
    }

    @Override
    public void Gwang_2() {
        System.out.println("광안대교 2반");
    }

    @Override
    public void Gwang_3() {
        System.out.println("광안대교 3반");
    }

    @Override
    public void Gwang_4() {
        System.out.println("광안대교 4반");
    }

    @Override
    public void Gwang_5() {
        System.out.println("광안대교 5반");
    }
}
