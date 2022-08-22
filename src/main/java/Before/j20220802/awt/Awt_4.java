package Before.j20220802.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Awt_4 extends Frame implements ActionListener
{
    public static void main(String[] args) {
        Awt_4 awt_4 = new Awt_4();
    }

    public Awt_4() {
        Panel p = new Panel();

        Button button1 = new Button("button1");
        button1.addActionListener(this);
        Button button2 = new Button("button2");
        button2.addActionListener(this);
        Button button3 = new Button("button3");
        button3.addActionListener(this);
        Button button4 = new Button("button4");
        button4.addActionListener(this);
        Button button5 = new Button("button5");
        button5.addActionListener(this);
        p.add(button1);
        p.add(button2);
        p.add(button3);
        p.add(button4);
        p.add(button5);
        add(p);
        setSize(300,300);
        setVisible(true);

        addWindowListener(new WindowEvent());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        System.out.println(action);

        switch (action){
            case "button1":
                System.out.println(action);
                break;
            case "button2":
                System.out.println(action);
                break;
            case "button3":
                System.out.println(action);
                break;
            case "button4":
                System.out.println(action);
                break;
            case "button5":
                System.out.println(action);
                break;

        }
    }

    public class WindowEvent extends CommonWindowEvent{
    }
}
