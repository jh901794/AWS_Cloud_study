package j20220727;

public class Array_6 {
    public static void main(String[] args) {
        String[][] str_arr = {{"±è", "ÀÌ", "¹Ú"}, {"¿À", "°­", "ÃÖ"}};

        for(int i = 0; i < str_arr.length; i++){
            for(int j = 0; j < str_arr[i].length; j++){
                if(str_arr[i][j].equals("±è")){
                    System.out.println(str_arr[i][j] + "¾¾");
                }
            }
        }
        for(int i = 0; i < str_arr.length; i++){
            for(int j = 0; j < str_arr[i].length; j++){
                if(str_arr[i][j].equals("ÀÌ")){
                    System.out.println(str_arr[i][j] + "¾¾");
                }
            }
        }
    }
}
