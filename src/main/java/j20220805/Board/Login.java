package j20220805.Board;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Login extends Command {
    public String member = "/Member";
    public Login() {
        try {
            System.out.print("ID : ");
            ID = buffer.readLine();
            System.out.print("PWD : ");
            PWD = buffer.readLine();
            file = new File(path+member+"/"+ID + ".txt");
            reader = new BufferedReader(new FileReader(path+member+"/"+ID + ".txt"));
            if(file.isFile()){
                token = new StringTokenizer(reader.readLine());
                if(token.nextToken().equals(PWD)){
                    System.out.println("�α��� ����");
                    Board_List();
                }else {
                    System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
                    First_Page();
                }
            }else{
                System.out.println("���̵� �����ϴ�.");
                First_Page();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
