package Before.j20220805.Board;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First_Page extends Command {
    static Command command = new Command();
    public static void main(String[] args) throws IOException {
        First_Page first_page = new First_Page();
    }

    public First_Page() {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1. �α��� 2. ȸ������");
        int a = 0;
        try {
            a = Integer.parseInt(buffer.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(a == 1){
            Login();
        }else {
            Sign();
        }
    }
}
