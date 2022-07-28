package questionpool;

import java.util.ArrayList;

public class board_1 {
    int num, view;
    String title, name, day,like;

    public static void main(String[] args) {
        ArrayList<board_1> al = new ArrayList<>();
        board_1 b_1 = new board_1(1,0,"글제목 1","작성자 1","20220727","0");
        board_1 b_2 = new board_1(2,0,"글제목 2","작성자 2","20220727","0");
        board_1 b_3 = new board_1(3,0,"글제목 3","작성자 3","20220727","0");
        board_1 b_4 = new board_1(4,0,"글제목 4","작성자 4","20220727","0");
        board_1 b_5 = new board_1(5,0,"글제목 5","작성자 5","20220727","0");
        al.add(b_1);
        al.add(b_2);
        al.add(b_3);
        al.add(b_4);
        al.add(b_5);

        for(String b : args){

        }
        System.out.println("\t 번호 \t 제목 \t 작성자 \t 작성일 \t 조회 \t 좋아요");
        System.out.println("======================================================");
        for(int i = 0; i < al.size(); i++){
            System.out.println("\t " + al.get(i).getNum() + "     "+ al.get(i).getTitle() + "\t"+ al.get(i).getName() + "\t"+ al.get(i).getDay() + "\t"+ al.get(i).getView() + "       "+ al.get(i).getLike() );
        }
    }

    public board_1(int num, int view, String title, String name, String day, String like) {
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
