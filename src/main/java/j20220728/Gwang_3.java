package j20220728;

public class Gwang_3 {
    String name;
    int init;
    public String getName() {
        return name;
    }

    public Gwang_3() {
        System.out.println(++init);
    }

    //생성자를 만드는 이유 : 중복으로 값을 저장해야 하는 경우 코드를 줄이기 위해서
    public Gwang_3(String name) {
        this.name = name;
    }

    public Gwang_3(int init) {
        System.out.println(init);
    }

    public static void main(String[] args) {
        Gwang_3 gw = new Gwang_3("이름");
        for(int i = 0; i < 5; i++){
            new Gwang_3(i);
            new Gwang_3();
        }
    }
}
