package j20220805;

public class OverLoading_1 {
    public String name, String;
    public int age;

    // 오버로딩 : 함수명은 같으나 인자의 개수, 타입가 다른경우
    public static void main(String[] args) {
        OverLoading_1 overLoading_1 = new OverLoading_1();
    }

    public void Print(){
        System.out.println("print1");
    }
    public void Print(String name){
        System.out.println("print1" + name);
    }
    public void Print(int age){
        System.out.println("print1" + age);
    }
    public void Print(String[] args){
        System.out.println("print1" + args);
    }

    public OverLoading_1() {
        this("김재훈","부산");
        System.out.println("기본 생성자");
    }

    public OverLoading_1(String name, String string, int age) {
        this.name = name;
        String = string;
        this.age = age;
        System.out.println("String name, String string, int age");
    }
    public OverLoading_1(String name, String string) {
        this.name = name;
        String = string;
        System.out.println("String name, String address");
    }

}
