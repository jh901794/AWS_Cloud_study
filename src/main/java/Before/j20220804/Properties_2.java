package Before.j20220804;

import java.io.*;
import java.util.Properties;

public class Properties_2 {
    public static void main(String[] args) {
        String path = "/project/share/questionfile/console.common.properties";
        // \project\share\questionfile
        Properties p = new Properties();

        File file = new File(path);
        System.out.println(file.getPath());
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            p.load(bufferedReader);
            System.out.println(bufferedReader.readLine());
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
