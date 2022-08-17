package j20220817.bean;

public class LoginBean {
    String userid, passwd, email;



    public LoginBean(String userid, String passwd, String email) {
		this.userid = userid;
		this.passwd = passwd;
		this.email = email;
	}

	public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    
}
