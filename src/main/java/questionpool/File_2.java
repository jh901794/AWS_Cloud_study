package questionpool;

import java.io.*;

public class File_2 {
    public static void main(String[] args) throws IOException {
        String path = "/project/share/questionfile";
        File file = new File(path + "/" + "home.txt");
        file.createNewFile();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello World!1");
        fileWriter.close();
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("Hello World!2");
        bufferedWriter.close();*/
        File file2 = new File(path);
        String filearray[] = file2.list();
        String input = "";
        while ((input = bufferedReader.readLine()) != null){
            System.out.println(input);
        }
        for(int i = 0; i < filearray.length; i++){
            System.out.println(filearray[i]);
        }
    }
}
