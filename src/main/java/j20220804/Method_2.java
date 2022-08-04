package j20220804;

import Common.CommonHome;

import java.util.ArrayList;

public class Method_2 extends CommonHome {

    public Method_2(String name, String address, int age) {
        super(name, address, age);
    }

    public static void main(String[] args) {
        Method_2 me2 = new Method_2("±Ë¿Á»∆","∫ŒªÍ",20);
        ArrayList<Method_2> al = new ArrayList<>();
        for(int i =0; i < 5; i++){
            Method_2 me = new Method_2("±Ë¿Á»∆"+i,"∫ŒªÍ"+i,20+i);
            al.add(me);
        }
        for(int i =0; i < al.size(); i++){
            System.out.println(al.get(i).getName());

            System.out.println(al.get(i).getAge());

            System.out.println(al.get(i).getAddress());
        }
    }
}
