package Before.j20220803;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class Awt_2 extends JFrame implements ActionListener, WindowListener {
    public JTextField inputbox;
    public ArrayList arr;
    public static void main(String[] args) {
        Awt_2 awt_2 = new Awt_2();
    }

    public Awt_2() {
        JPanel jp = new JPanel();

        inputbox = new JTextField(15);
        JButton btn = new JButton("input1");
        btn.addActionListener(this);
        jp.add(inputbox);
        jp.add(btn);
        add(jp);
        setSize(300,300);
        setVisible(true);
        addWindowListener(this);
    }
    public ArrayList getList(){
        if(arr == null) {
            arr = new ArrayList();
        }
        return arr;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String even = e.getActionCommand();

        ArrayList array = getList();
        array.add(inputbox.getText());

        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }

    }

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
}
