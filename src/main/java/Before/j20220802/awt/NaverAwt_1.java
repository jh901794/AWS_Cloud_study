package Before.j20220802.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NaverAwt_1 extends CommonAwtEvent2 implements ActionListener {
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
        login.addActionListener(this::actionPerformed);
        add(login);

        passwd = new TextField(15);
        passwd.addActionListener(this::actionPerformed);
        add(passwd);

        Button btn = new Button("Sign In");
        btn.addActionListener(this::actionPerformed);

        add(btn);



        addWindowListener(new CommonAwtEvent2());
        setSize(500, 500);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String even = e.getActionCommand();
        if(even.equals("Sign In")) {
            System.out.println("�Էµ� ���̵� : " + login.getText() + "\t�Էµ� ��й�ȣ : " + passwd.getText());
            if(login.getText().equals(s_id) && passwd.getText().equals(s_pw)) {
                System.out.println("�α��� ����");
            }else{
                System.out.println("�α��� ����");
            }
        }


    }
}
