package Common;

public class CommonHome {
    // public : 누구나 접근
    // private : 현 클래스만
    private String name, address,email;
    private int age;

    public CommonHome() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public CommonHome(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
