package Before.j20220811;

public class Commoninfo {
	private String userid, subject, data;
	private int like, count;

	public Commoninfo(String userid, String subject, String data, int like, int count) {
		this.userid = userid;
		this.subject = subject;
		this.data = data;
		this.like = like;
		this.count = count;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getSbject() {
		return subject;
	}

	public void setSbject(String sbject) {
		this.subject = sbject;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
