package j20220804.mega;

public abstract class Mega_Factory implements BaseMega {
    @Override
    public void Room() {
        System.out.println(getChoiceRoom());
    }

    public String choiceRoom;
    String name, address;
    int age;

    public Mega_Factory() {
    }

    public Mega_Factory(String choiceRoom) {
        this.choiceRoom = choiceRoom;
    }

    public String getChoiceRoom() {
        return choiceRoom;
    }

    public void setChoiceRoom(String choiceRoom) {
        this.choiceRoom = choiceRoom;
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
    public static void Setter(Mega_Factory mf, String name, int age, String addr){
        mf.setName(name);
        mf.setAge(age);
        mf.setAddress(addr);
    }
    public static void Printing(BaseMega bm){
        System.out.println("======================");
        System.out.println(bm.getClass());
        System.out.println("이름 : " + bm.getName());
        System.out.println("나이 : " + bm.getAge());
        System.out.println("주소 : " + bm.getAddress());
    }

}
