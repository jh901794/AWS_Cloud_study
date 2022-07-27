package j20220727;

import questionpool.Gwang_2;

public class GlobalVal_2 {
    //전역변수의 경우 초기화하지 않으면 null을 반환한다.
    public String name;
    public int age = 24;
    public String adress = "북구";

    public static void main(String[] args) {
        GlobalVal_2 g2 = new GlobalVal_2();
        //null 빈값을 반환할때. int의 경우 null 대신 0이 반환

        String name = null;
        String age = null;
        String address = null;

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println("==============================");
        System.out.println(g2.name);
        System.out.println(g2.age);
        System.out.println(g2.adress);

        System.out.println("광안대교2 import");

        Gwang_2 gw_2 = new Gwang_2();
        System.out.println(gw_2.name);

        System.out.println(gw_2.name);
        System.out.println(gw_2.age);
        System.out.println(gw_2.adress);
    }
}
