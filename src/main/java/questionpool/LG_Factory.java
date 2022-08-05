package questionpool;

public abstract class LG_Factory implements LGBase {
    String PhoneCompanyName;
    String name, email,address;
    int age, num1,num2;
    public static Object[] info = {"jaehoon", "jh901794@gmail.com", "Busan", 24,990101, 1111111};

    @Override
    public void Printing(String where, Object[] objects){
        System.out.println("계약한곳 : " + where);
        for(int i = 0; i < objects.length; i++){
            System.out.print(objects[i] + "  ");
        }
    }
    @Override
    public void Printing_1(){
        LG_Deal lg_deal = new LG_Deal("DEALER",info);
        System.out.println("계약한곳 : " + lg_deal.getPhoneCompanyName());
        System.out.println(lg_deal.getName() + "  " +lg_deal.getEmail() + "  " +lg_deal.getAddress() +
                "  " +lg_deal.getAge() + "  " +lg_deal.getNum1() + "  " +lg_deal.getNum2());

    }
    @Override
    public String getPhoneCompanyName() {
        return PhoneCompanyName;
    }
    @Override
    public void setPhoneCompanyName(String phoneCompanyName) {
        PhoneCompanyName = phoneCompanyName;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getEmail() {
        return email;
    }
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int getNum1() {
        return num1;
    }
    @Override
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    @Override
    public int getNum2() {
        return num2;
    }
    @Override
    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
