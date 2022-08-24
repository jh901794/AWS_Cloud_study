package Before.j20220822;

public class CoupangBean {
    public String id, pwd, name, email, jumin1,jumin2;

    public CoupangBean() {
    }

    public CoupangBean(String id, String pwd, String name, String email) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
    }

    public CoupangBean(String id, String pwd, String name, String email, String jumin1, String jumin2) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.email = email;
        this.jumin1 = jumin1;
        this.jumin2 = jumin2;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJumin1() {
        return jumin1;
    }

    public void setJumin1(String jumin1) {
        this.jumin1 = jumin1;
    }

    public String getJumin2() {
        return jumin2;
    }

    public void setJumin2(String jumin2) {
        this.jumin2 = jumin2;
    }
}
