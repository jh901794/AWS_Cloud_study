package j20220729;

import java.util.ArrayList;

public class ArrayList_2 {
    String name;
    String address;
    int age;

    public static void main(String[] args) {
        ArrayList_2 Al2 = new ArrayList_2();
        Al2.setName("김재훈");
        Al2.setAddress("부산");
        Al2.setAge(24);

        ArrayList<ArrayList_2> al = new ArrayList();
        al.add(Al2);

        // 아무튼 String으로 변환하기 위해서는 Strign.valueOf를 사용하면 된다.
        for(int i = 0; i < al.size(); i++){
            System.out.println(al.get(i).getName() + "\t " + al.get(i).getAddress() + "\t " + al.get(i).getAge());
        }
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
