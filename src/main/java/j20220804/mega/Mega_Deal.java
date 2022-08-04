package j20220804.mega;

import java.util.ArrayList;

public class Mega_Deal {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        ArrayList al = new ArrayList();
        for(int i = 0; i < 5; i++){
            al.add(Class.forName("j20220804.mega.Gwang_"+(i+1)).newInstance());
            BaseMega bm = (BaseMega) al.get(i);
            bm.setChoiceRoom((i+1)+"¹Ý");
            System.out.println(bm.getChoiceRoom());
        }
/*

        Gwang_1 gwang_1 = new Gwang_1();
        gwang_1.setChoiceRoom("1¹Ý");
        System.out.println(gwang_1.getChoiceRoom());
*/

    }
}
