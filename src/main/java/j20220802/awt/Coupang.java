package j20220802.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coupang extends CommonAwtEvent2 implements ActionListener {

    TextField logintext;
    TextField passwdtext;

    public static void main(String[] args) {
        Coupang coupang = new Coupang();
    }

    public Coupang() {
        setLayout(new GridLayout(3,2));
        Label loginla = new Label("userid");
        logintext = new TextField(15);
        add(loginla);
        add(logintext);

        Label passwd = new Label("PassWD");
        passwdtext = new TextField(15);
        add(passwd);
        add(passwdtext);

        Button login_btn = new Button("login");
        login_btn.addActionListener(this::actionPerformed);
        Button Sign_btn = new Button("Sign_In");
        add(login_btn);
        add(Sign_btn);

        setSize(400,240);
        setVisible(true);

        addWindowListener(new CommonAwtEvent2());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String even = e.getActionCommand();
        if(even.equals("login")) {
            String userid = logintext.getText().trim();
            String userpass = passwdtext.getText().trim();

            if (userid.equals("hi") && userpass.equals("hi")){
                System.out.println("로그인성공");
            }else{
                System.out.println("로그인실패");
            }
        }
    }

}
