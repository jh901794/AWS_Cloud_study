package j20220802.awt;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Border_1 extends Frame {
    public static void main(String[] args) {
        Border_1 border_1 = new Border_1();
    }

    public Border_1() {
        setLayout(new BorderLayout());
        Button bu1 = new Button("North");
        add( bu1, BorderLayout.NORTH);
        bu1.addActionListener(new ActionEvent());

        Button bu2 = new Button("West");
        add(bu2, BorderLayout.WEST);
        bu2.addActionListener(new ActionEvent());

        Button bu3 = new Button("Center");
        add(bu3, BorderLayout.CENTER);
        bu3.addActionListener(new ActionEvent());

        Button bu4 = new Button("East");
        add(bu4, BorderLayout.EAST);
        bu4.addActionListener(new ActionEvent());

        Button bu5 = new Button("South");
        add(bu5, BorderLayout.SOUTH);
        bu5.addActionListener(new ActionEvent());


        addWindowListener(new WindowEvent());
        setSize(300,300);
        setVisible(true);
    }
    public class WindowEvent extends CommonWindowEvent{}

    public class ActionEvent implements ActionListener{

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            String even = e.getActionCommand();
            switch (even) {
                case "North":
                    System.out.println(even);
                    break;
                case "West":
                    System.out.println(even);
                    break;
                case "Center":
                    System.out.println(even);
                    break;
                case "East":
                    System.out.println(even);
                    break;
                case "South":
                    System.out.println(even);
                    break;
            }
        }
    }
}
