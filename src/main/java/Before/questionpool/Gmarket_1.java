package Before.questionpool;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

public class Gmarket_1 extends JFrame implements WindowListener, ActionListener {
    JTextField tf_1,tf_2;
    JLabel lb_3;
    ArrayList arr;
    String id, pwd;
    public Gmarket_1() {

        Panel pn1 = new Panel(new GridLayout(4,2));
        JLabel lb_1 = new JLabel("ID : ");
        tf_1 = new JTextField(15);
        JLabel lb_2 = new JLabel("PassWD : ");
        tf_2 = new JTextField(15);
        JButton btn_1 = new JButton("Login");
        btn_1.addActionListener(this);
        JButton btn_2 = new JButton("Sign in");
        btn_2.addActionListener(this);
        pn1.add(lb_1);
        pn1.add(tf_1);
        pn1.add(lb_2);
        pn1.add(tf_2);
        pn1.add(btn_1);
        pn1.add(btn_2);
        add(pn1);
        lb_3 = new JLabel("");
        pn1.add(lb_3);

        setSize(300,300);
        setVisible(true);
    }

    public Gmarket_1(String id, String pwd) throws HeadlessException {
        this.id = id;
        this.pwd = pwd;
    }

    public static void main(String[] args) {
        Gmarket_1 gm = new Gmarket_1();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String even = e.getActionCommand();
        ArrayList array = getList();
        switch (even){
            case "Sign in" :
                Gmarket_1 gm1 = new Gmarket_1(tf_1.getText(), tf_2.getText());
                array.add(gm1);
                System.out.println(gm1.getId() + gm1.getPwd());
                break;
            case "Login":
                if(array != null) {
                    for (int i = 0; i < array.size(); i++){
                        Gmarket_1 gm = (Gmarket_1) array.get(i);
                        if(tf_1.getText().equals(gm.getId()) && tf_2.getText().equals(gm.getPwd())){
                            lb_3.setText("Login Success ==  result [ ID :  " + tf_2.getText() + " PWD :  " + tf_2.getText() + "   ]");
                        }else {
                            lb_3.setText("Login Faild");
                        }
                    }
                }
        }
    }
    public ArrayList getList(){
        if(arr == null) {
            arr = new ArrayList();
        }
        return arr;
    }


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

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
