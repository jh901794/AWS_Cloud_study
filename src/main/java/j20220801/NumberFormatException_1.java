package j20220801;

public class NumberFormatException_1 {
    public static void main(String[] args) {
        try {
            int value = Integer.parseInt("32");
            value += 10;
            System.out.println(value);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
