package Common.util;

public class userBean {
	Object userid, passwd, email, age;
	public userBean(String userid, String passwd, String email, int age) {
		super();
		this.userid = userid;
		this.passwd = passwd;
		this.email = email;
		this.age = age;
	}
	public Object getUserid() {
		return userid;
	}
	public void setUserid(Object userid) {
		this.userid = userid;
	}
	public Object getPasswd() {
		return passwd;
	}
	public void setPasswd(Object passwd) {
		this.passwd = passwd;
	}
	public Object getEmail() {
		return email;
	}
	public void setEmail(Object email) {
		this.email = email;
	}
	public Object getAge() {
		return age;
	}
	public void setAge(Object age) {
		this.age = age;
	}
	
}
