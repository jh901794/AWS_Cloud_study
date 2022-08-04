package j20220804;

import java.util.Properties;

public class Properties_1 {
    public static void main(String[] args) {
        // \:\=
        Properties p = new Properties();
        // key, value
        // property : 명세서 << 설정에 대한 값.
        // global.properties 처럼 사용용
        // key-value 는 1대1 메핑이라 검색때 많이 사용됨.
        for(int i =1; i <= 5; i ++){
            p.put(i, i);
        }
        // list : full index > 0부터 max까지 돌려서 검색한다. << 값이 많을수록 시간이 오래걸림
        // list는 단순 출력때 많이 사용.
        for(int i = 1; i <= p.size(); i++){
            System.out.println(p.get(i));
        }
    }
}
