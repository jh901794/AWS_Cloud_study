package Before.questionpool.q20220805;

import java.io.*;
import java.util.ArrayList;
import java.util.Properties;

public abstract class Mega_2 implements Base_An{

    String path = "/project/share/file1";
    String[] arr = {"An_1","An_2","An_3","An_4","An_5"};
    ArrayList al = new ArrayList();

    @Override
    public void MakeFile(String str) {
        File file = new File(path + "/"+str+".txt");

        try {
            file.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/"+str+".properties"));
            for(int i =0; i < al.size(); i++){
                bw.write(arr[i] + " = " + al.get(i));
            }
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void inst() {
        for(int i =0; i < arr.length; i++) {
            try {
                Base_An base_an = (Base_An) Class.forName("Before.questionpool.q20220805."+arr[i]).newInstance();
                al.add(base_an.getClass() + "\n");
                base_an.Print();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
    @Override
    public void Print() {}


    @Override
    public void ReadFile(String str) {
        File file = new File(path + "/"+str+".properties");
        Properties p = new Properties();
        try {
            BufferedReader br =new BufferedReader(new FileReader(path + "/"+str+".properties"));
            p.load(br);
            for(int i =0; i < 5; i++){
                System.out.println(p.get("An_"+(i+1)));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
