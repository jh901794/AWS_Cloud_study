package Before.j20220728;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput_1 {
    // Main Method�� JVM�� ȣ���ؼ� �����Ѵ�.
    // thorw�� JVM�� �����ٴ� �Ҹ�?
    String name;
    String address;
    int age;

    public static void main(String[] args) throws IOException {
        // ����ó�� : �����(IO) , ��Ʈ��ũ(chat), �ν��Ͻ�(new) �� ��� ���� ���� ����ó�� �ؾ���.
        // Exception : ��� ����ó�� ��� �θ� Ŭ����
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
