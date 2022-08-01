package Common;

public class CommonHome {
    // public : 누구나 접근
    // private : 현 클래스만
    private String name, address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        CommonHome comm = new CommonHome();
        System.out.println(comm.name = "김재훈");
        System.out.println(comm.address = "부산");
        System.out.println(comm.age = 24);
    }
}
