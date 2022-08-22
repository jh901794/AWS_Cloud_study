package Before.j20220805.Board;

import java.io.File;

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
        System.out.println("| 1. �Խñ� ����  |  2 . �� �ۼ�  |  3. �ڷΰ��� |");
        a = Scan();
        switch (a){
            case 1 :
                System.out.print("�����Ͻ� �Խñ� ��ȣ�� �����ϼ��� : ");
                b = Scan();
                break;
            case 2 :


        }
    }
}
