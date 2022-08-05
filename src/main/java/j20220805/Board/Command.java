package j20220805.Board;

import java.io.*;
import java.util.StringTokenizer;

public class Command extends Navigater{
    public static String path = "/project/share/test";
    String ID,PWD,EMAIL, AGE;
    File file;
    static BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader reader;
    StringTokenizer token;

    public static int Scan(){
        int a = 0;
        try {
            a = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return a;
    }

}
