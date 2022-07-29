package BeakJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_1010 {
    int T, M, N;
    public static void main(String[] args) throws IOException {
        Q_1010 proj = new Q_1010();
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        buffer.readLine();
        proj.setT(Integer.parseInt(buffer.readLine()));

    }


    public int getT() {
        return T;
    }
    public void setT(int t) {
        T = t;
    }
    public int getM() {
        return M;
    }
    public void setM(int m) {
        M = m;
    }
    public int getN() {
        return N;
    }
    public void setN(int n) {
        N = n;
    }
}
