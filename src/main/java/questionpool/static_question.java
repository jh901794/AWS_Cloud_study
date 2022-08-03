package questionpool;

public class static_question {
    String name, address;
    int age;

    static String s_name;
    static String s_address;
    static int s_age;

    public static void main(String[] args) {
        static_question sq = new static_question("±Ë¿Á»∆","∫ŒªÍ",24);
        static_question.s_name = "s±Ë¿Á»∆";
        static_question.s_address = "s∫ŒªÍ";
        static_question.s_age = 25;
        System.out.println("ª˝º∫¿⁄ ∞¥√º=====================");
        System.out.println(sq.getName() + "\t " + sq.getAddress() + "\t" + sq.getAge());
        System.out.println("Static ∞¥√º====================");
        System.out.println(static_question.s_name + "\t " + static_question.s_address + "\t" + static_question.s_age);
    }

    public static_question(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;

        static_question.s_name = name;
        static_question.s_address = address;
        static_question.s_age = age;
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

    public static String getS_name() {
        return s_name;
    }

    public static void setS_name(String s_name) {
        static_question.s_name = s_name;
    }

    public static String getS_address() {
        return s_address;
    }

    public static void setS_address(String s_address) {
        static_question.s_address = s_address;
    }

    public static int getS_age() {
        return s_age;
    }

    public static void setS_age(int s_age) {
        static_question.s_age = s_age;
    }
}
