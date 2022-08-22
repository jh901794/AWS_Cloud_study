package Before.j20220802.awt;

import java.awt.*;

public class Awt_3 extends Frame {
    public static void main(String[] args) {
        Awt_3 awt_3 = new Awt_3();
    }

    public Awt_3() {
        setSize(300, 300);
        setVisible(true);
        addWindowListener(new WindowEvents());
    }

    // InnerClass�� �ٱ��� �ִ� ��� �޼ҵ峪 ������ �� �� �ִ�.
    // InnerClass�� API ������ ó���� ���� �� InnerClass�� �����Ѵ�.
    public class WindowEvents extends CommonWindowEvent{
        public void WindowClosing(java.awt.event.WindowEvent e){
            super.windowClosing(e);
        }
    }
}
