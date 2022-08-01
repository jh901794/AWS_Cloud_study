package j20220801.mega;

public class Instance_1 {
    public String name = "±Ë¿Á»∆";
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Instance_1 inst = (Instance_1) Class.forName("j20220801.mega.Instance_1").newInstance();
        System.out.println(inst.name);
        System.out.println("=======================");
        Instance_1 inst_2 = new Instance_1();
        System.out.println(inst_2.name);
    }
}
