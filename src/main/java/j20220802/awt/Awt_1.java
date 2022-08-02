package j20220802.awt;

import java.awt.*;

public class Awt_1 extends Frame {
    public static void main(String[] args) {
        Awt_1 awt_1 = new Awt_1();

    }

    public Awt_1() {
        Button button = new Button("button");
        add(button);
        setSize(600,400);
        setVisible(true);
        setBackground(Color.black);

    }
}
