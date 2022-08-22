package Before.questionpool;

import java.util.ArrayList;
import java.util.Hashtable;

public class List_Hash_1 {
    int view,like;
    String title,writer,day;
    public static void main(String[] args) {
        ArrayList<Hashtable> al = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            List_Hash_1 lh = new List_Hash_1(i,0,"����"+i,"�ۼ���"+i,"20220729");
            Hashtable hash = new Hashtable();
            hash.put("title", lh.getTitle());
            hash.put("writer", lh.getWriter());
            hash.put("day", lh.getDay());
            hash.put("view", lh.getView());
            hash.put("like", lh.getLike());

            al.add(hash);
        }
        System.out.println("�۹�ȣ \t ���� \t �ۼ��� \t �ۼ��� \t ��ȸ \t ���ƿ�" );
        System.out.println("===================================================");
        for(int i = 0; i<al.size(); i++){
            Hashtable h_v = al.get(i);
            System.out.println(i + "       " + h_v.get("title") + "\t" + h_v.get("writer") + "\t" +  h_v.get("day")  + "     " +  h_v.get("view")  + "      " +  h_v.get("like") );
        }

    }

    public List_Hash_1(int view, int like, String title, String writer, String day) {
        this.view = view;
        this.like = like;
        this.title = title;
        this.writer = writer;
        this.day = day;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
