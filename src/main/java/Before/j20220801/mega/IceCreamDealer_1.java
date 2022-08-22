package Before.j20220801.mega;

import java.util.Hashtable;

public class IceCreamDealer_1 {
    public static void main(String[] args) {
        /*IceCream_Gugu gu = new IceCream_Gugu();
        gu.IceCreamExecute();

        IceCream_World world= new IceCream_World();
        world.IceCreamExecute();

        IceCream_Bibi bibi = new IceCream_Bibi();
        bibi.IceCreamExecute();*/

        IceCream ice_1 = new IceCream_Bibi();
        IceCream ice_2 = new IceCream_Gugu();
        IceCream ice_3 = new IceCream_World();

        Hashtable table = new Hashtable();
        table.put(1,ice_1);
        table.put(2,ice_2);
        table.put(3,ice_3);
        for(int i = 1; i <= table.size(); i++){
            IceCream icecommon = (IceCream) table.get(i);
            icecommon.IceCreamExecute();
        }

    }
}
