package j20220801;

public class NullPointerException_1 {
    public static void main(String[] args) {
        // NullPointerException : null값을 다른 것으로 바꿀때
        // (아무것도 없는데 값을 변하려고 할때.

        try {
            String name = "abcdefg";
            name = null;
            // 대문자로 변환 : toUpperCase
            name = name.toUpperCase();

            System.out.println(name);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
