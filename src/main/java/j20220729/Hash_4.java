package j20220729;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Hashtable;

public class Hash_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Boolean boo1 = true, boo2 = true;
        String n_t;
        // hash map : key value 값
        ArrayList<Hashtable> al = new ArrayList();

        while (boo1) {
            Hashtable hash = new Hashtable();
            System.out.print("이름 : ");
            hash.put(0, buffer.readLine());
            System.out.print("나이 : ");
            hash.put(1, buffer.readLine());
            System.out.print("주소 : ");
            hash.put(2, buffer.readLine());
            System.out.println("그만두려면 #");
            al.add(hash);
            String cheak = buffer.readLine();
            if (cheak.equals("#")) {
                boo1 = false;
                break;
            }

        }
        if (boo1 == false)
            for (int i = 0; i < al.size(); i++) {
                Hashtable hash = al.get(i);
                System.out.print("이름 : " + hash.get(0) + "\t");
                System.out.print("나이 : " + hash.get(1) + "\t");
                System.out.println("주소 : " + hash.get(2));
                System.out.println("=======================");
            }

        while(boo1 == false){
            System.out.println("검색할 분야 (이름 : n / 나이 : a / 주소 : d) : ");
            String type = buffer.readLine();
            switch (type){
                case "n":
                    System.out.print("검색할 이름 : ");
                    n_t = buffer.readLine();
                    for(int i = 0; i < al.size(); i++){
                        Hashtable n_h = al.get(i);
                        if(n_h.get(0).equals(n_t)){
                            System.out.println("검색된 이름");
                            System.out.println("=======================");
                            System.out.print("이름 : " + n_h.get(0) + "\t");
                            System.out.print("나이 : " + n_h.get(1) + "\t");
                            System.out.println("주소 : " + n_h.get(2));
                            System.out.println("=======================");
                        }
                    }
                    n_t = null;
                    break;
                case "a":
                    System.out.print("검색할 나이 : ");
                    n_t = buffer.readLine();
                    for(int i = 0; i < al.size(); i++){
                        Hashtable n_h = al.get(i);
                        if(n_h.get(1).equals(n_t)){
                            System.out.println("검색된 나이");
                            System.out.println("=======================");
                            System.out.print("이름 : " + n_h.get(0) + "\t");
                            System.out.print("나이 : " + n_h.get(1) + "\t");
                            System.out.println("주소 : " + n_h.get(2));
                            System.out.println("=======================");
                        }
                    }
                    n_t = null;
                    break;
                case "d":
                    System.out.print("검색할 주소 : ");
                    n_t = buffer.readLine();
                    for(int i = 0; i < al.size(); i++){
                        Hashtable n_h = al.get(i);
                        if(n_h.get(1).equals(n_t)){
                            System.out.println("검색된 주소");
                            System.out.println("=======================");
                            System.out.print("이름 : " + n_h.get(0) + "\t");
                            System.out.print("나이 : " + n_h.get(1) + "\t");
                            System.out.println("주소 : " + n_h.get(2));
                            System.out.println("=======================");
                        }
                    }
                    n_t = null;
                    break;
            }
            System.out.println("그만두려면 #");
            String cheak = buffer.readLine();
            if (cheak.equals("#")) {
                break;
            }
        }
    }
}
