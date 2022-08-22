package Before.j20220803;

import java.io.File;
import java.io.IOException;

public class File_1 {
    public static void main(String[] args) throws IOException {
        String path = "/project/share/file1";
        String[] filecreate = {"test3.txt", "test4.txt", "test5.txt"};
        File file = new File(path);
        /*
        String[] file_arr = file.list();
        for(int i =0; i < file_arr.length; i++){
            System.out.println(file_arr[i]);
        }*/
        for (int i = 0; i < filecreate.length; i++) {
            File file2 = new File(path + "/" + filecreate[i]);
            file.createNewFile();
        }
    }
}
