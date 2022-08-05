package j20220804.mega;

import Common.CommonHome;
import j20220805.Phone.BaseNewsAgency;

import java.util.ArrayList;

public class Gwang_1 extends Mega_Factory {

    public static void main(String[] args) {
        Gwang_1 gw = new Gwang_1();
        gw.setChoiceRoom("1반");
        Gwang_2 gw2 = new Gwang_2();
        gw.setChoiceRoom("1반");

        Mega_Factory mega_factory = new Gwang_1();
        mega_factory.setChoiceRoom("2반");

        BaseMega baseMega = new Gwang_1();
        baseMega.setChoiceRoom("3반");

        System.out.println(gw.getChoiceRoom());
        System.out.println(mega_factory.getChoiceRoom());
        System.out.println(baseMega.getChoiceRoom());


        ArrayList arr = new ArrayList();
        BaseMega baseMega1 = new Gwang_1();
        BaseMega baseMega2 = new Gwang_1();
        BaseMega baseMega3 = new Gwang_1();
        BaseMega baseMega4 = new Gwang_1();
        BaseMega baseMega5 = new Gwang_1();
        arr.add(baseMega1);
        arr.add(baseMega2);
        arr.add(baseMega3);
        arr.add(baseMega4);
        arr.add(baseMega5);
        System.out.println("============================");
        for(int i =0; i < arr.size(); i++){
            BaseMega mega = (BaseMega) arr.get(i);
            mega.setChoiceRoom((i+1)+"반");
            System.out.println(mega.getChoiceRoom());
        }

    }
}
