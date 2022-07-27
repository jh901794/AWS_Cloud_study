package questionpool;

public class AllStudy {
    public String name;
    public int age;
    public String addr;

    public static void main(String[] args) {
        int[] j = new int[8];
        String[] names = {"±èÀçÈÆ", "È«±æµ¿", "¾Æ¹«°³"};
        char[] homes = {'±è', 'ÀÌ', '¹Ú'};
        int[][] is = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int sum = 0;

        //1¹ø
        for(int i = 0; i < j.length; i++){
            j[i] = i+2;
            sum += j[i];
        }
        System.out.println(sum);
        System.out.println("=============================");
        //2¹ø
        for(int i = 0; i < names.length; i++){
            if(names[i].equals("±èÀçÈÆ")){
                System.out.println(names[i] + "¾¾ Ã£¾Ò½À´Ï´Ù.");
            }
        }
        System.out.println("=============================");
        //3¹ø
        for(int i = 0; i < homes.length; i++){
            if('±è' == homes[i]){
                System.out.println(homes[i] + "¾¾ Ã£¾Ò½À´Ï´Ù.");
            }
        }
        System.out.println("=============================");
        //4¹ø
        sum = 0;
        for(int i = 0; i < is.length; i++){
            for(int js =0; js < is[i].length; js++){
                sum += is[i][js];
            }
        }
        System.out.println(sum);

        System.out.println("=============================");
        //5¹ø
        AllStudy allStudy1 = new AllStudy();
        allStudy1.setName("±èÀçÈÆ");
        allStudy1.setAge(24);
        allStudy1.setAddr("ºÎ»ê");

        System.out.println(allStudy1.getName());
        System.out.println(allStudy1.getAge());
        System.out.println(allStudy1.getAddr());

        AllStudy allStudy2 = new AllStudy();
        allStudy2.setName("È«±æµ¿");
        allStudy2.setAge(15);
        allStudy2.setAddr("Á¶¼±");

        System.out.println(allStudy2.getName());
        System.out.println(allStudy2.getAge());
        System.out.println(allStudy2.getAddr());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
