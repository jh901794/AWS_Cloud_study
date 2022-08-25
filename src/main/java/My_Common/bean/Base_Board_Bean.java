package My_Common.bean;

public class Base_Board_Bean {
    public String number, subject, currentdate, userid, count, like;

    public Base_Board_Bean(String number, String subject, String currentdate, String userid, String count, String like) {
        this.number = number;
        this.subject = subject;
        this.currentdate = currentdate;
        this.userid = userid;
        this.count = count;
        this.like = like;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentdate() {
        return currentdate;
    }

    public void setCurrentdate(String currentdate) {
        this.currentdate = currentdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
