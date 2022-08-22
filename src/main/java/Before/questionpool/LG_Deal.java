package Before.questionpool;

public class LG_Deal extends LG_Factory{

    public LG_Deal(String where, Object[] obj){
        this.PhoneCompanyName = where;
        this.name = (String) obj[0];
        this.email = (String) obj[1];
        this.address = (String) obj[2];
        this.age = (Integer) obj[3];
        this.num1 = (Integer) obj[4];
        this.num2 = (Integer) obj[5];
    }

}
