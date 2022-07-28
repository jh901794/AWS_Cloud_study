package j20220728;

public class Ctr_1 {

    // Method : 반드시 중괄호가 있다.
    // 변수나 배열은 괄호를 사용하지 않는다.
    // 메서드는 여러 타입을 받을 수 있다.
    // 변수는 움직일 수 없으니 메서드를 통해서 움직인다.
    // jdbc > mvc1 모델로 변경
    String name;
    String address;

    public static void main(String[] args) {
        // new 연산자 : 메모리 할당 -> 객체
        //Ctr_1 ctr_1 = new Ctr_1();

        Ctr_1 ctr_1 = new Ctr_1("김재훈", "주소");
        System.out.println(ctr_1.getName() + "\n" + ctr_1.getAddress());
    }

    //인자가 있는 생성자가 오면 기본 생성자는 생략할 수 없다.
    public Ctr_1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //public Ctr_1() {
    //    System.out.println("기본 생성자 입니다.");
    //}

}
