package j20220729;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        // new ArrayList<E> : 인자값을 받을 준비가 되었다는 의미
        // 생략 가능하다.
        // list의 index 는 0, 값을 추가할 경우 add를 사용한다.
        // 배열과 유사. arraylist는 index를 가지고, 여러 변수형을 받을 수 있다.
        // 배열과 달리 크기를 지정해두지 않아도 된다.
        ArrayList arrayList = new ArrayList();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,4);
        arrayList.add(4,5);

        // ArrayList에서 get메서드는 arraylist에 어떤 변수형이 있을지 모르므로
        // Object타입으로 출력을 요청한다.
        for(int i = 0; i < arrayList.size(); i++){
            int value = (int) arrayList.get(i);
        }

        //1부터 10까지 값을 저장하고 합을 출력하시오
        // ArrayList를 초기화 하는 방법은 ArrayList.clear

        ArrayList al = new ArrayList();
        int sum = 0;
        for(int i = 0; i < 10; i++){
            al.add(i,i+1);
            sum += (int) al.get(i);
        }
        System.out.println(sum);

    }
}
