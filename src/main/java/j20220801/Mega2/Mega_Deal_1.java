package j20220801.Mega2;

import java.util.ArrayList;

public class Mega_Deal_1 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        /*
        Gwang_1 gw1 = new Gwang_1();
        gw1.Room();
        Gwang_2 gw2 = new Gwang_2();
        gw2.Room();
        Gwang_3 gw3 = new Gwang_3();
        gw3.Room();
        Gwang_4 gw4 = new Gwang_4();
        gw4.Room();
        Gwang_5 gw5 = new Gwang_5();
        gw5.Room();
        */

        Mega2 me1 = new Gwang_1();
        Mega2 me2 = new Gwang_2();
        Mega2 me3 = new Gwang_3();
        Mega2 me4 = new Gwang_4();
        Mega2 me5 = new Gwang_5();

        ArrayList list = new ArrayList();
        list.add(me1);
        list.add(me2);
        list.add(me3);
        list.add(me4);
        list.add(me5);
        for(int i = 0; i < list.size(); i++){
            Mega2 mecommon = (Mega2) list.get(i);
            mecommon.ChoiceRoom();
        }
        System.out.println("================");

        for(int i = 0; i < 5; i++) {
            Mega2 me = (Mega2) Class.forName("j20220801.Mega2.Gwang_"+(i+1)).newInstance();
            me.ChoiceRoom();
        }
    }
}
