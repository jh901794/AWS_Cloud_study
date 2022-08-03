package j20220803;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter_1 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\project\\share\\questionfile\\file1.txt";
        PrintWriter writer = new PrintWriter(path);
        StringBuffer buffer = new StringBuffer();
        buffer.append("4    \n");
        buffer.append("5    \n");
        buffer.append("6    \n");
        writer.print(buffer.toString());
        // flush : 메모리에서 내린다.
        writer.flush();
    }
}
