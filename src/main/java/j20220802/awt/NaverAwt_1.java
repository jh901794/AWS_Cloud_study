package j20220802.awt;

import java.awt.*;

public class NaverAwt_1 extends CommonAwtEvent2{
    static TextField login;
    static TextField passwd;
    static String s_id = "hi";
    static String s_pw = "hi";
    public static void main(String[] args) {
        NaverAwt_1 na = new NaverAwt_1();
    }
    public NaverAwt_1() {
        setLayout(new GridLayout(3,1));

        login = new TextField(15);
        login.addActionListener(new CommonAwtEvent2());
        add(login);

        passwd = new TextField(15);
        passwd.addActionListener(new CommonAwtEvent2());
        add(passwd);

        Button btn = new Button("Sign In");
        btn.addActionListener(new CommonAwtEvent2());

        add(btn);



        addWindowListener(new CommonAwtEvent2());
        setSize(500, 500);
        setVisible(true);
    }
}
