package Before.j20220802.awt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class awt_2 extends Frame implements WindowListener {
    public static void main(String[] args) {
        awt_2 awt_2 = new awt_2();
    }
    public awt_2() {
        Frame f2 = new Frame("banner");
        f2.setSize(400,400);
        f2.setVisible(true);
        f2.addWindowListener(this);

    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("�����");
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
}
