package j20220803;

import java.io.File;
import java.io.IOException;

public class File_2 {
    public static void main(String[] args) throws IOException {
        String path = "project/share/questionfile/file1.txt";
        File file = new File(path);
        System.out.println(file.getPath());

        file.createNewFile();
        if(file.isDirectory()){
            System.out.println("디렉토리 입니다.");
        }
        if(file.isFile()){
            System.out.println("파일입니다.");
        }
    }
}
