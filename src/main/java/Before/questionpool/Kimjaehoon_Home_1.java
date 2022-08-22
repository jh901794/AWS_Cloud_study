package Before.questionpool;

import Common.CommonHome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;

public class Kimjaehoon_Home_1 extends CommonHome {
    static Hashtable h_t = new Hashtable();
    static Kimjaehoon_Home_1 home = new Kimjaehoon_Home_1(null, null, 0);
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

    static int count;
    public static void main(String[] args) {
        System.out.print("�Է��� ��� ���� �������� : " );
        try {
            C_Inputed();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
        System.out.println("������ �̸� �ּ� ���� ������ �ۼ��ϼ���.");

        try {
            Print(count,P_Inputed(count));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int C_Inputed() throws IOException {
        count = Integer.parseInt(buffer.readLine());
        return count;
    }

    public static Hashtable P_Inputed(int p_count) throws IOException {
        for(int i = 0; i< p_count; i++ ){
            home.setName(buffer.readLine());
            home.setAddress(buffer.readLine());
            home.setAddress(buffer.readLine());
            hasht(i,home);
        }
        return null;
    }
    public static Hashtable hasht(int time, Kimjaehoon_Home_1 home) {
        h_t.put(time,home);
        return h_t;
    }

    public static void Print(int num, Hashtable hash){
        // getClass �� get���� ����� Key���� OBjectŸ�� �߿��� �ڵ����� �´� ������ ����Ѵ�.
        for(int i = 0; i < num; i++) {
            Kimjaehoon_Home_1 type = (Kimjaehoon_Home_1) hash.get(i);
            System.out.println(type.getName() + "\t " + type.getAddress() + "\t" + type.getAge());
        }
    }

    public Kimjaehoon_Home_1(String name, String address, int age) {
        this.setName(name);
        this.setAddress(address);
        this.setAge(age);
    }
}
