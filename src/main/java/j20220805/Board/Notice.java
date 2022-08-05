package j20220805.Board;

import java.io.File;
import java.io.IOException;

public class Notice extends Command{
    File file = new File(path + "/Notice" );
    String[] Notice_List = file.list();
    int a, b;
    public Notice() {
        System.out.println("===============================================");
        for(int i = 0; i < Notice_List.length; i++){
            file = new File(path + "/Notice/" + Notice_List[i]);
            System.out.println( i + "  " + Notice_List[i]);
        }
        System.out.println("===============================================");
        System.out.println("| 1. 게시글 보기  |  2 . 글 작성  |  3. 뒤로가기 |");
        a = Scan();
        switch (a){
            case 1 :
                System.out.print("열람하실 게시글 번호를 선택하세요 : ");
                b = Scan();
                break;
            case 2 :


        }
    }
}
