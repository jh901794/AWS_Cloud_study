package j20220805.Board;

import java.io.IOException;

public class Board_List extends Command{
    public Board_List() {
        System.out.println("===============================================");
        System.out.println("1. ��������  2. ���ȴ뱳  3. �����Խ���");
        System.out.println("===============================================");
        System.out.print("���Ͻô� �Խ����� �����ϼ��� :  ");
        try {
            int a = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
