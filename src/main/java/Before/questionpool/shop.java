package Before.questionpool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class shop extends IceCream_fac{
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) {
        shop shop = new shop();
        try {
            System.out.println("������ 1, ������ 2, ���� 3");
            int i = Integer.parseInt(buffer.readLine());
            switch (i){
                case 1:
                    shop.gugucon();
                    break;
                case 2:
                    shop.worldcon();
                    break;
                case 3:
                    shop.bibibig();
                    break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
