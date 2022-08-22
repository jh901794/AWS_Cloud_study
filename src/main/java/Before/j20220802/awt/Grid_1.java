package Before.j20220802.awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid_1 extends Frame implements ActionListener {
    public static void main(String[] args) {
        Grid_1 g_1 = new Grid_1();
    }

    public Grid_1() {
        setLayout(new GridLayout(3,3));
        for(int i =1; i <= 9; i++){
            Button bu = new Button(""+i);
            bu.addActionListener(this);
            add(bu);
        }
        addWindowListener(new WindowEvent());
        setSize(300,300);
        setVisible(true);
    }
    public class WindowEvent extends CommonWindowEvent{}

    @Override
    public void actionPerformed(ActionEvent e) {
        String even = e.getActionCommand();
        switch (even) {
            case "1":
                System.out.println(even);
                break;
            case "2":
                System.out.println(even);
                break;
            case "3":
                System.out.println(even);
                break;
            case "4":
                System.out.println(even);
                break;
            case "5":
                System.out.println(even);
                break;
            case "6":
                System.out.println(even);
                break;
            case "7":
                System.out.println(even);
                break;
            case "8":
                System.out.println(even);
                break;
            case "9":
                System.out.println(even);
                break;
        }
    }
}
