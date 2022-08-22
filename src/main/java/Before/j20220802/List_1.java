package Before.j20220802;

import java.util.ArrayList;

public class List_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        for(int i = 0; i < 5; i++){
            list.add(i);
            System.out.println(list.get(i));
        }
    }
}
