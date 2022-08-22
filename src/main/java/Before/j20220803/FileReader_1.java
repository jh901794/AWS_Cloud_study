package Before.j20220803;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReader_1 {
    public static void main(String[] args) {
        String path = "/project/share/file1/text.txt";
        // FileReader : ���Ͽ� ���� ������ ó���Ѵ�.
        try {
            BufferedReader buffer = new BufferedReader(new FileReader(path));
            String inputname ="";
            while ((inputname = buffer.readLine()) != null){
                System.out.println(inputname);
            }
            buffer.readLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
