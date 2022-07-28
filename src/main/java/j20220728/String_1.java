package j20220728;

public class String_1 {
    public static void main(String[] args) {
        //문자열 = 문자 + 문자
        // char은 예약어. String은 클래스.
        String str = new String("김재훈");
        System.out.println(str);

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '재')
            System.out.println(str.charAt(i));
        }

        Character character = '김';
        if(character.equals('김'))System.out.println(true);
        else System.out.println(false);
    }
}
