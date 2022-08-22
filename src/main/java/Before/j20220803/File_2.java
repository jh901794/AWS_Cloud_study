package Before.j20220803;

import java.io.File;
import java.io.IOException;

public class File_2 {
    public static void main(String[] args) throws IOException {
        String path = "project/share/questionfile/file1.txt";
        File file = new File(path);
        System.out.println(file.getPath());

        file.createNewFile();
        if(file.isDirectory()){
            System.out.println("���丮 �Դϴ�.");
        }
        if(file.isFile()){
            System.out.println("�����Դϴ�.");
        }
    }
}
