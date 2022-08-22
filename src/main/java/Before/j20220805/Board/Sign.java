package Before.j20220805.Board;

import java.io.*;

public class Sign extends Command {
    public String member = "/Member";

    public Sign() {
        try {
            System.out.print("ID : ");
             ID = buffer.readLine();
            System.out.print("PWD : ");
            PWD = buffer.readLine();
            System.out.print("EMAIL : ");
            EMAIL = buffer.readLine();
            System.out.print("AGE : ");
            AGE = buffer.readLine();
            file = new File(path+member+"/"+ID + ".txt");
            file.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(path+member+"/"+ID + ".txt"));
            bw.write(PWD);
            bw.write(" " +EMAIL);
            bw.write(" " + AGE);
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
