package j20220825.bean;

public class Diablo_Board_Bean extends BaseBean {


    public String boardsubject;
    public String boardcurrentdate;
    public String boardcount;
    public String boardlike;



    public String getBoardsubject() {
        return boardsubject;
    }

    public String getBoardcurrentdate() {
        return boardcurrentdate;
    }

    public String getBoardcount() {
        return boardcount;
    }

    public String getBoardlike() {
        return boardlike;
    }

    //기본생성자
    public Diablo_Board_Bean() {
        // TODO Auto-generated constructor stub
    }


    public Diablo_Board_Bean(String numindex, String userid, String birthday, String email, String jumin1, String jumin2, String phone, String address) {

        this.numindex = numindex;
        this.userid= userid;
        this.birthday= birthday;
        this.email= email;
        this.jumin1= jumin1;
        this.jumin2= jumin2;
        this.phone= phone;
        this.address = address;
    }

    public Diablo_Board_Bean(String numindex, String userid, String boardsubject, String boardcurrentdate, String email, String  boardcount, String  boardlike) {

        this.numindex = numindex;
        this.userid= userid;
        this.boardsubject= boardsubject;
        this.boardcurrentdate = boardcurrentdate;
        this.email = email;
        this.boardcount = boardcount;
        this.boardlike = boardlike;

    }




}