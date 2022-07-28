package j20220728;

import java.util.StringTokenizer;

public class Token_2 {
    public static void main(String[] args) {
        String home = "김재훈/20/집";
        StringTokenizer token = new StringTokenizer(home,"/");
        while (token.hasMoreTokens()){
            //이렇게하면 next에 계속 걸려서 지금게 안나온다.
            //배열에 넣고 실행해야할듯.
            if(token.nextElement().equals("김재훈")) System.out.println("이름 검색");
        }

    }
}
