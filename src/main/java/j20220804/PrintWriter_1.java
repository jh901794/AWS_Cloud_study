package j20220804;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Properties;

public class PrintWriter_1 {
    public static void main(String[] args) throws Exception {
        String path = "/project/share/questionfile/common_2.properties";
        File file = new File(path);
        file.delete();
        if(file.createNewFile()) {
            System.out.println("파일이 생성됨");
        }else{
            System.out.println("파일이 이미 있다");
        }

        if(file.isFile()){
            PrintWriter pw = new PrintWriter(path);
            pw.write("User_ID = Kimjaehoon\n");
            pw.write("User_ADDRESS = BuSan\n");
            pw.write("User_AGE = 24\n");
            pw.close();
            System.out.println("작성됨");
        }
        Properties p = new Properties();
        BufferedReader reader = new BufferedReader(new FileReader(path));
        // key-value

        p.load(reader);
        Enumeration en = p.elements();
        while (en.hasMoreElements()){
            String value = (String) en.nextElement();
            System.out.println(value);
        }

    }
}
