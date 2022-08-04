package questionpool;

import java.io.*;
import java.nio.file.Files;
import java.util.Enumeration;
import java.util.Properties;

// 이름 나이 주소 이메일 앞주민 뒷주민
public class Home_1 {
    public static void main(String[] args) throws IOException {
        String path = "/project/share/questionfile/home.properties";
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        File file = new File(path);
        Properties p = new Properties();
        if(file.createNewFile()){
            System.out.println("파일 생성");
        }else {
            System.out.println("있는 파일");
        }
        if(file.isFile()){
            bw.write("User_Name = Kimjaehoon \n ");
            bw.write("User_AGE = 24 \n");
            bw.write("User_ADDRESS = BUSAN \n");
            bw.write("First_num = 990101 \n");
            bw.write("Second_Num = 1111111\n");
            bw.close();
            System.out.println("사용자 정보 작성됨.");
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        p.load(br);

        Enumeration e = p.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        System.out.println(p.getProperty("User_Name"));
    }
}
