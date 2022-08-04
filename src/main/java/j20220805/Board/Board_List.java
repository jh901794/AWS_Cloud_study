package j20220805.Board;

import java.io.IOException;

public class Board_List extends Command{
    public Board_List() {
        System.out.println("===============================================");
        System.out.println("1. 공지사항  2. 광안대교  3. 자유게시판");
        System.out.println("===============================================");
        System.out.print("원하시는 게시판을 선택하세요 :  ");
        try {
            int a = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
