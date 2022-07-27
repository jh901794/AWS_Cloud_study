package j20220727;

public class Method_1 {
    // 변수로 움직일 수 없다.
    // 변수로 입출력 안된다.
    // 메서드로 입출력한다.
    public String name;
    public int age;
    public String adress;

    public static void main(String[] args) {
        Method_1 me = new Method_1();

        System.out.println(me.getName());
        me.setName("김재훈");
        System.out.println(me.getName());
    }


    //Method(함수) : 접근제한자 타입 메서드명명
    //get, set, add 설정, 삽입, 수정
    //this는 일반적으로 생략가능.
    //지역변수와 전역변수가 이름이 같을 경우 생략할 수 없다.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

}
