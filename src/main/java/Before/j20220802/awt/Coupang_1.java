package Before.j20220802.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Coupang_1 extends CommonAwtEvent2 implements ActionListener {
    TextField id, pwd, check_pwd, name, num;

    public static void main(String[] args) {
        Coupang_1 c_1 = new Coupang_1();
    }

    public Coupang_1() {
        setSize(300, 800);
        setVisible(true);
        setLayout(new GridLayout(6, 2));

        Label l_id = new Label("ID : ");
        id = new TextField(15);
        Label l_pwd = new Label("PWD : ");
        pwd = new TextField(15);
        Label l_C_pwd = new Label("PWD_CHECK : ");
        check_pwd = new TextField(15);
        Label l_name = new Label("NAME : ");
        name = new TextField(15);
        Label l_num = new Label("NUMBER : ");
        num = new TextField(15);

        add(l_id);
        add(id);

        add(l_pwd);
        add(pwd);

        add(l_C_pwd);
        add(check_pwd);

        add(l_name);
        add(name);

        add(l_num);
        add(num);

        Button login = new Button("Login");
        login.addActionListener(this);
        Button Signin = new Button("Sign in");
        Signin.addActionListener(this);

        add(login);
        add(Signin);
        addWindowListener(new CommonAwtEvent2());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String even = e.getActionCommand();
        switch (even) {
            case "Login":
                if (id.getText().trim().equals("hi") && pwd.getText().trim().equals("hi")) {
                    System.out.println("�α��� ����");
                } else {
                    System.out.println("�α��� ����");
                }
                break;
            case "Sign in":
                if (pwd.getText().trim().equals(check_pwd.getText().trim())) {
                    System.out.println("ȸ������ �Ǿ����ϴ�.");
                } else {
                    System.out.println("��й�ȣ�� �ٸ��ϴ�.");
                }
        }
    }
}
    
