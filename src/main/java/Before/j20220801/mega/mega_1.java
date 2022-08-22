package Before.j20220801.mega;

import Common.CommonHome;

import java.util.Enumeration;
import java.util.Hashtable;

public class mega_1 extends CommonHome {
    public static void main(String[] args) {

        Gwang_1 gw1 = new Gwang_1("������1","�λ�",21);
        Gwang_2 gw2 = new Gwang_2("������2","�λ�",22);
        Gwang_3 gw3 = new Gwang_3("������3","�λ�",23);
        Gwang_4 gw4 = new Gwang_4("������4","�λ�",24);
        Gwang_5 gw5 = new Gwang_5("������5","�λ�",25);
        String[] arr = {"Before.j20220801.mega.Gwang_1","Before.j20220801.mega.Gwang_2","Before.j20220801.mega.Gwang_2","Before.j20220801.mega.Gwang_4","Before.j20220801.mega.Gwang_5"};


        Hashtable hash = new Hashtable();
        hash.put(gw1.getName(),gw1);
        hash.put(gw2.getName(),gw2);
        hash.put(gw3.getName(),gw3);
        hash.put(gw4.getName(),gw4);
        //hash.put(gw5.getName(),gw5);

        Enumeration en = hash.keys();
        for(int i =0; i < arr.length; i++){
            while (en.hasMoreElements()){
                Object keys = en.nextElement();
                //String room = hash.get(keys).getClass().getName();
                    try {
                        //CommonHome home = (CommonHome)Class.forName(arr[i]).newInstance();
                        CommonHome comhome = (CommonHome) hash.get(keys);
                        String classname = comhome.getClass().getName();
                        System.out.print(classname);

                        //if(arr[i].equals(classname)){
                            System.out.print("\t" + comhome.getName());
                            System.out.print("\t" + comhome.getAddress());
                            System.out.print("\t" + comhome.getAge());
                        System.out.println();
                        //}


                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    hash.get(keys);
                    //System.out.println("���̸��� " + arr[i] + "�Դϴ�.");

            }
        }
    }

    public mega_1(String name, String address, int age) {
        this.setName(name);
        this.setAddress(address);
        this.setAge(age);
    }
}
