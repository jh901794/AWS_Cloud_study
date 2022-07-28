package j20220728;

public class firstnameSearch_1 {
    public static void main(String[] args) {
        String name[] = {"±èÀçÈÆ", "¾Æ¹«°³", "È«±æµ¿"};
        char[] first = {'¿À', 'ÀÌ','±è'};
        char[][] names = new char[name.length][3];

        for(int i = 0; i < name.length; i++){
            for(int j = 0; j < name.length; j++){
                names[i][j] = name[i].charAt(j);
            }
            System.out.println(name[i]);
        }
        System.out.println("============================");
        for(int i = 0; i< first.length; i++){
            names[i][0] = first[i];
            name[i] = "" + names[i][0] + names[i][1] + names[i][2];
            System.out.println(name[i]);
        }
        System.out.println("============================");
        for(int i = 0; i < name.length; i++){
            name[i] = first[i] + name[i].substring(1);
            System.out.println(name[i]);
        }
    }
}
