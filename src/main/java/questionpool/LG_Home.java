package questionpool;

public class LG_Home extends LG_Factory{


    public static void main(String[] args) {
        // 대리점
        LG_Home lg_h = new LG_Home();
        System.out.println("===========================");
        //집
        LG_Home lg_home = new LG_Home("Home",info);

    }
    // 대리점
    public LG_Home() {
        super.Printing_1();
    }
    //집
    public LG_Home(String str, Object[] obj) {
        super.Printing(str,obj);
    }
}
