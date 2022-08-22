package Before.questionpool;

public class LG_Home extends LG_Factory{


    public static void main(String[] args) {
        // �븮��
        LG_Home lg_h = new LG_Home();
        System.out.println("===========================");
        //��
        LG_Home lg_home = new LG_Home("Home",info);

    }
    // �븮��
    public LG_Home() {
        super.Printing_1();
    }
    //��
    public LG_Home(String str, Object[] obj) {
        super.Printing(str,obj);
    }
}
