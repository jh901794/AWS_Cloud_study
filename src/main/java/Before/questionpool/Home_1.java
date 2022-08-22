package Before.questionpool;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

// �̸� ���� �ּ� �̸��� ���ֹ� ���ֹ�
public class Home_1 {
    public static void main(String[] args) throws IOException {
        String path = "/project/share/questionfile/home.properties";
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        File file = new File(path);
        Properties p = new Properties();
        if(file.createNewFile()){
            System.out.println("���� ����");
        }else {
            System.out.println("�ִ� ����");
        }
        if(file.isFile()){
            bw.write("User_Name = Kimjaehoon \n ");
            bw.write("User_AGE = 24 \n");
            bw.write("User_ADDRESS = BUSAN \n");
            bw.write("First_num = 990101 \n");
            bw.write("Second_Num = 1111111\n");
            bw.close();
            System.out.println("����� ���� �ۼ���.");
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        p.load(br);

        Enumeration e = p.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        System.out.println("========================");
        System.out.println("�̸� : " + p.getProperty("User_Name"));
        System.out.println("���� : " + p.getProperty("User_AGE") + "��");
        System.out.println("�ּ� : " + p.getProperty("User_ADDRESS"));
        System.out.println("��ȣ : " + p.getProperty("First_num") + "-" + p.getProperty("Second_Num"));

    }
}
