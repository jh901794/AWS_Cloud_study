package j20220728;

import java.sql.Wrapper;

public class Object_2 extends Object{
    public static void main(String[] args) {
        String name = "재훈";
        System.out.println(name);

        Object name2 = "무개";
        System.out.println(name2.getClass().getName());

        // Wrapper class
        // 반드시 객체나 static을 통해서만 변수가 메서드 호출이 가능하다.
        // String에서 Int로 변경하는 형변환
        // static : class명.변수 클래스명. 메서드 명

        // 강제 캐스팅 형변환.
        int age = 20;

        Integer age2 = 30;

        int age3 = age2.parseInt("30");

        System.out.println(age3);

        age3 += 10;
        System.out.println(age3);

        String name3 = String.valueOf(age);
        System.out.println(name3.getClass().getName());
    }
}
