package j20220728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_1 {
    // Main Method는 JVM이 호출해서 실행한다.
    // thorw는 JVM에 던진다는 소리?
    String name;
    String address;
    int age;

    public static void main(String[] args) throws IOException {
        // 에러처리 : 입출력(IO) , 네트워크(chat), 인스턴스(new) 의 경우 강제 에러 예외처리 해야함.
        // Exception : 모든 에러처리 담당 부모 클래스
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        InputOutput_1 io = new InputOutput_1(null,null,0);
        io.setName(buffer.readLine());
        io.setAge(Integer.parseInt(buffer.readLine()));
        io.setAddress(buffer.readLine());
        System.out.println(io.getName() + "\t"+ io.getAddress() +"\t"+ io.getAge());

    }

    public InputOutput_1(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public  String getName() {
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
