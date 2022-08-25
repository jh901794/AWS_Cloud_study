package My_Common.bean;

public class Base_User_Bean {
    public String user_id, user_pwd, user_birth,user_email, regist_num, phone, address, name, age;

    public Base_User_Bean(String user_id, String user_pwd) {
        this.user_id = user_id;
        this.user_pwd = user_pwd;
    }

    public Base_User_Bean(String address, String name, String age) {
        this.address = address;
        this.name = name;
        this.age = age;
    }

    public Base_User_Bean(String user_id, String user_pwd, String user_birth, String user_email, String regist_num, String phone, String address) {
        this.user_id = user_id;
        this.user_pwd = user_pwd;
        this.user_birth = user_birth;
        this.user_email = user_email;
        this.regist_num = regist_num;
        this.phone = phone;
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getUser_birth() {
        return user_birth;
    }

    public void setUser_birth(String user_birth) {
        this.user_birth = user_birth;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getRegist_num() {
        return regist_num;
    }

    public void setRegist_num(String regist_num) {
        this.regist_num = regist_num;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
