package questionpool;

public class AllStudy {
    public String name;
    public int age;
    public String addr;

    public static void main(String[] args) {
        int[] j = new int[8];
        String[] names = {"������", "ȫ�浿", "�ƹ���"};
        char[] homes = {'��', '��', '��'};
        int[][] is = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        int sum = 0;

        //1��
        for(int i = 0; i < j.length; i++){
            j[i] = i+2;
            sum += j[i];
        }
        System.out.println(sum);
        System.out.println("=============================");
        //2��
        for(int i = 0; i < names.length; i++){
            if(names[i].equals("������")){
                System.out.println(names[i] + "�� ã�ҽ��ϴ�.");
            }
        }
        System.out.println("=============================");
        //3��
        for(int i = 0; i < homes.length; i++){
            if('��' == homes[i]){
                System.out.println(homes[i] + "�� ã�ҽ��ϴ�.");
            }
        }
        System.out.println("=============================");
        //4��
        sum = 0;
        for(int i = 0; i < is.length; i++){
            for(int js =0; js < is[i].length; js++){
                sum += is[i][js];
            }
        }
        System.out.println(sum);

        System.out.println("=============================");
        //5��
        AllStudy allStudy1 = new AllStudy();
        allStudy1.setName("������");
        allStudy1.setAge(24);
        allStudy1.setAddr("�λ�");

        System.out.println(allStudy1.getName());
        System.out.println(allStudy1.getAge());
        System.out.println(allStudy1.getAddr());

        AllStudy allStudy2 = new AllStudy();
        allStudy2.setName("ȫ�浿");
        allStudy2.setAge(15);
        allStudy2.setAddr("����");

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
