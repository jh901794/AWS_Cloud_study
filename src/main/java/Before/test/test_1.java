package Before.test;

import java.io.*;
import java.time.LocalDate;

public class test_1 {
    String title, writer;
    int view, like;
    static LocalDate day;
    static String M_path = "C:\\project\\share\\Before.test\\member.txt";

    public static void main(String[] args) throws IOException {
        test_1 test = new test_1();
        Signin();
    }

    public static void Login() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ID : ");
        String u_id = bufferedReader.readLine();
        System.out.print("PW : ");
        String u_pw = bufferedReader.readLine();



    }
    public static void Signin() throws IOException {
        PrintWriter writer = new PrintWriter(M_path);
        StringBuffer buffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ID : ");
        buffer.append(bufferedReader.readLine());
        buffer.append(" ");
        System.out.print("PW : ");
        buffer.append(bufferedReader.readLine());
        writer.print(buffer.toString());
        writer.flush();
    }
    public test_1() {
    }

    public test_1(String title, String writer, int view, int like, LocalDate day) {
        this.title = title;
        this.writer = writer;
        this.view = view;
        this.like = like;
        this.day = day;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public static LocalDate getDay() {
        return day;
    }

    public static void setDay(LocalDate day) {
        test_1.day = day;
    }

}
