package j20220802.awt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Awt_3 extends Frame {
    public static void main(String[] args) {
        Awt_3 awt_3 = new Awt_3();
    }

    public Awt_3() {
        setSize(300, 300);
        setVisible(true);
        addWindowListener(new WindowEvents());
    }

    // InnerClass는 바깥에 있는 모든 메소드나 변수를 쓸 수 있다.
    // InnerClass는 API 단위로 처리가 많을 때 InnerClass로 구분한다.
    public class WindowEvents extends CommonWindowEvent{
        public void WindowClosing(java.awt.event.WindowEvent e){
            super.windowClosing(e);
        }
    }
}
