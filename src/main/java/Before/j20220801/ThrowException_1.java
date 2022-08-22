package Before.j20220801;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ThrowException_1 {
    // main�� jvm �� ȣ��. throw�� jvm�� ������.
    public static void main(String[] args) {
        ThrowException_1 t_1 = new ThrowException_1();
        try {
            t_1.Print();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public String NewLine() throws Exception{
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
            String input = buffer.readLine();
            System.out.println(input);
        return input;
    }
    public String Print() throws Exception {
        String str_val = NewLine();

        return str_val;
    }
}
