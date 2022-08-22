package Before.j20220727;

public class Array_6 {
    public static void main(String[] args) {
        String[][] str_arr = {{"��", "��", "��"}, {"��", "��", "��"}};

        for(int i = 0; i < str_arr.length; i++){
            for(int j = 0; j < str_arr[i].length; j++){
                if(str_arr[i][j].equals("��")){
                    System.out.println(str_arr[i][j] + "��");
                }
            }
        }
        for(int i = 0; i < str_arr.length; i++){
            for(int j = 0; j < str_arr[i].length; j++){
                if(str_arr[i][j].equals("��")){
                    System.out.println(str_arr[i][j] + "��");
                }
            }
        }
    }
}
