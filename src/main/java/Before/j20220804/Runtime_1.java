package Before.j20220804;

import java.io.IOException;

public class Runtime_1 {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        runtime.exec("notepad.exe");
    }
}
