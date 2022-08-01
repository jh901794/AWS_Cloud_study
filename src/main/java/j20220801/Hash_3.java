package j20220801;

import Common.CommonHome;

import java.util.LinkedHashMap;

public class Hash_3 extends CommonHome {
    // 부모 : 모든 유전자를 자식이 상속받는다.
    // 자바에서도 부모에 있는 모든 것을 상속받는다.
    // 자식은 부모의 모든것을 가질 수 있다.
    // 부모안에 자식이 있다.
    // inherit 상속받고있다.
    public static void main(String[] args) {
        LinkedHashMap hash = new LinkedHashMap();
    }

    public Hash_3(String name, String address, int age) {
        this.setAddress(address);
    }
}
