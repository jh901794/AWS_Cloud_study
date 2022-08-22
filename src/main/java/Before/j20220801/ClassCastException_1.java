package Before.j20220801;

public class ClassCastException_1 {
    public static void main(String[] args) {
        try {
            Object ob = new Integer(1);
            int strval = (int)ob;
            System.out.println(strval);
        }catch (ClassCastException e){
            e.printStackTrace();
        }
    }
}
