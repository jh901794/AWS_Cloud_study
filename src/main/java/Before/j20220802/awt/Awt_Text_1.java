package Before.j20220802.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Awt_Text_1 extends Frame implements ActionListener{
    public static void main(String[] args) {
        Awt_Text_1 at1 = new Awt_Text_1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public Awt_Text_1() {
        setLayout(new GridLayout(3,1));

        setSize(300,300);
        setVisible(true);
        TextField login = new TextField(15);
        login.addActionListener(new CommonAwtEvent2());
        add(login);
        TextField passwd = new TextField(15);
        passwd.addActionListener(new CommonAwtEvent2());
        add(passwd);

        addWindowListener(new CommonAwtEvent2());
        Button btn = new Button("Sign In");
        add(btn);

    }
}
