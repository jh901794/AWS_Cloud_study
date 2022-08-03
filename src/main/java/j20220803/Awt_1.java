package j20220803;

import j20220802.awt.CommonAwtEvent2;

import java.awt.*;
import java.awt.event.ActionEvent;

public class Awt_1 extends CommonAwtEvent2 {
    public static void main(String[] args) {
        Awt_1 awt_1 = new Awt_1();
    }

    public Awt_1() {
        Frame frame = new Frame("¥ÎπÆ¿Â");
        frame.setLayout(new FlowLayout());
        Button btn1 = new Button("bu1");
        Button btn2 = new Button("bu2");
        Button btn3 = new Button("bu3");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        frame.setSize(300,300);
        frame.setVisible(true);

        frame.addWindowListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String even = e.getActionCommand();
        switch (even){
            case "bu1" :
                System.out.println(even);
                break;
            case "bu2":
                System.out.println(even);
                break;
            case "bu3":
                System.out.println(even);
                break;
        }
    }
}
