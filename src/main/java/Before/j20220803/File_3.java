package Before.j20220803;

import java.io.File;
import java.io.IOException;

public class File_3 {
    public static void main(String[] args) throws IOException {
        String path = "C:\\project\\share\\questionfile\\fileroom";
        File file = new File(path);
        file.mkdir();
        String[] filetxt = {"test1.txt","test2.txt","test3.txt","test4.txt","test5.txt"};

        File filenew1 = new File(path + "\\"+filetxt[0]);
        filenew1.createNewFile();
        File filenew2 = new File(path + "\\"+filetxt[1]);
        filenew2.createNewFile();
        File filenew3 = new File(path + "\\"+filetxt[2]);
        filenew3.createNewFile();
        File filenew4 = new File(path + "\\"+filetxt[3]);
        filenew4.createNewFile();
        File filenew5 = new File(path + "\\"+filetxt[4]);
        filenew5.createNewFile();

        String directory[] = {"dir1","dir2","dir3","dir4","dir5"};
        for(int i =0; i < directory.length; i++){
            File filemkdir = new File(path + "\\" + directory[i]);
            filemkdir.mkdir();
        }
        System.out.println("===========================================");
        File file5 =new File(path);
        String[] str = file5.list();
        for(int i = 0; i < str.length; i++){
            File file6 =new File(path+"\\"+str[i]);
            if(file6.isDirectory()){
                System.out.println("dir : " + str[i]);
            }
            if(file.isFile()){
                System.out.println("file : " + str[i]);
            }
        }
    }
}
