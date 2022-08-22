package Before.j20220802;

import Common.CommonHome;

import java.util.ArrayList;

public class List_2 extends CommonHome {
    int num, view;
    String title, name, day, like;
    static ArrayList<List_2> al = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                List_2 l_2 = (List_2) Class.forName("Before.j20220802.List_2").newInstance();
                l_2.setNum(i);
                l_2.setView(0);
                l_2.setTitle("������ " + i);
                l_2.setName("�ۼ��� " + i);
                l_2.setDay("2022080" + i);
                l_2.setLike("0");
                al.add(l_2);
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("\t ��ȣ \t ���� \t �ۼ��� \t �ۼ��� \t ��ȸ \t ���ƿ�");
        System.out.println("======================================================");
        for (int i = 0; i < al.size(); i++) {
            System.out.println("\t " + al.get(i).getNum() + "     " + al.get(i).getTitle() + "\t" + al.get(i).getName() + "\t" + al.get(i).getDay() + "\t" + al.get(i).getView() + "       " + al.get(i).getLike());
        }
    }

    public List_2() {
    }

    public List_2(int num, int view, String title, String name, String day, String like) {
        this.num = num;
        this.view = view;
        this.title = title;
        this.name = name;
        this.day = day;
        this.like = like;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}

