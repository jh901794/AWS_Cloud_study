package j20220729;

import java.util.Hashtable;

public class Hash_3 {
    String name, address, num1, num2;
    int age;
    public static void main(String[] args) {
        /*
        key Object < 모든 타입이 올 수 있다.
        class 부모 object < 모든 타입을 object가 받을 수 있다.
         */
        Hashtable hash = new Hashtable();
        hash.put("김재훈","김재훈");
        hash.put(1,1);
        hash.clear();
        //무명 클래스
        for(int i = 0; i < 3; i++){
            hash.put(i,new Hash_3("이름"+i,"부산", "00000"+i,"000000"+i,25));
        }

        for(int i =0; i < hash.size(); i++){
            Hash_3 hash_v = (Hash_3) hash.get(i);
            System.out.println("이름 : " + hash_v.getName());
            System.out.println("나이 : " + hash_v.getAge() + "세");
            System.out.println("주소 : " + hash_v.getAddress());
            System.out.println("주민등록번호 : " +hash_v.getNum1() + "-" + hash_v.getNum2());
            System.out.println("==================================");
        }

    }

    public Hash_3(String name, String address, String num1, String num2, int age) {
        this.name = name;
        this.address = address;
        this.num1 = num1;
        this.num2 = num2;
        this.age = age;
    }

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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
}


