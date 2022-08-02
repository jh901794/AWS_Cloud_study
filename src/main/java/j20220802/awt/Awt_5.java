package j20220802.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Awt_5 extends Frame {
    public static void main(String[] args) {
        Awt_5 awt_5 = new Awt_5();
    }

    public Awt_5() {
        setLayout(new FlowLayout());
        for (int i = 0; i < 5; i++) {
            Button bu = new Button("bu" + i);
            bu.addActionListener(new ActionEvent());
            add(bu);
        }
        setSize(300,300);
        setVisible(true);
        addWindowListener(new WindowEvent());
    }

    public class WindowEvent extends CommonWindowEvent{

    }
    public class ActionEvent implements ActionListener {

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            String action = e.getActionCommand();
            for (int i = 0; i < 5; i++) {
                String str = "bu"+i;
                switch (str) {
                    case "bu1":
                        System.out.println(action);
                        break;
                    case "bu2":
                        System.out.println(action);
                        break;
                    case "bu3":
                        System.out.println(action);
                        break;
                    case "bu4":
                        System.out.println(action);
                        break;
                    case "bu5":
                        System.out.println(action);
                        break;
                }
            }
        }
    }
}
