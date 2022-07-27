package j20220727;

public class Array_4 {
    public static void main(String[] args) {
        char[] c_value = new char[3];
        c_value[0] = '¿œ';
        c_value[1] = '∫Ù';
        c_value[2] = '±Ë';

        for(int i = 0; i < c_value.length; i++){
            if(c_value[i]== '±Ë') {
                System.out.println(c_value[i]);
            }
        }

    }
}
