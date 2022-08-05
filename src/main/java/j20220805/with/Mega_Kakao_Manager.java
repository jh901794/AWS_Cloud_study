package j20220805.with;
import questionpool.q20220805.An_1;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class Mega_Kakao_Manager  {

    public static void main(String[] args) throws Exception {
        String mega_path = "/project/share/file1/megacloud.txt";
        File file = new File(mega_path);
        file.createNewFile();
        PrintWriter print = new PrintWriter(mega_path);

        StringBuffer buffer = new StringBuffer();
        buffer.append("An_1 = j20220805.with.An_1 \n");
        buffer.append("An_2 = j20220805.with.An_2 \n");
        buffer.append("An_3 = j20220805.with.An_3 \n");
        buffer.append("An_4 = j20220805.with.An_4 \n");
        buffer.append("An_5 = j20220805.with.An_5 \n");

        print.write(String.valueOf(buffer));
        print.flush();

        BufferedReader br =new BufferedReader(new FileReader(mega_path));
        Properties p = new Properties();
        p.load(br);
        Enumeration e = p.keys();
        p.size();
        String [] array = new String[p.size()];
        System.out.println("=======================================");
        for (int i =0; e.hasMoreElements(); i++){
            String keys = (String) e.nextElement();
            String values = (String) p.get(keys).toString().trim();
            array[i] = values;
            Common_Mega_Kakao meka = (Common_Mega_Kakao) Class.forName(array[i]).newInstance();
            meka.Room("메가존 클라우드 " +(i+1),i+1);
        }

    }
}
