package j20220802.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CommonAwtEvent2 extends Frame implements WindowListener, ActionListener {
    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String even = e.getActionCommand();
        if(even.equals("Sign In")) {
            System.out.println("�Էµ� ���̵� : " + NaverAwt_1.login.getText() + "\t�Էµ� ��й�ȣ : " + NaverAwt_1.passwd.getText());
            if(NaverAwt_1.login.getText().equals(NaverAwt_1.s_id) && NaverAwt_1.passwd.getText().equals(NaverAwt_1.s_pw)) {
                System.out.println("�α��� ����");
            }else{
                System.out.println("�α��� ����");
            }
        }


    }
}
