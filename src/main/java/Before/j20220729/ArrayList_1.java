package Before.j20220729;

import java.util.ArrayList;

public class ArrayList_1 {
    public static void main(String[] args) {
        // new ArrayList<E> : ���ڰ��� ���� �غ� �Ǿ��ٴ� �ǹ�
        // ���� �����ϴ�.
        // list�� index �� 0, ���� �߰��� ��� add�� ����Ѵ�.
        // �迭�� ����. arraylist�� index�� ������, ���� �������� ���� �� �ִ�.
        // �迭�� �޸� ũ�⸦ �����ص��� �ʾƵ� �ȴ�.
        ArrayList arrayList = new ArrayList();
        arrayList.add(0,1);
        arrayList.add(1,2);
        arrayList.add(2,3);
        arrayList.add(3,4);
        arrayList.add(4,5);

        // ArrayList���� get�޼���� arraylist�� � �������� ������ �𸣹Ƿ�
        // ObjectŸ������ ����� ��û�Ѵ�.
        for(int i = 0; i < arrayList.size(); i++){
            int value = (int) arrayList.get(i);
        }

        //1���� 10���� ���� �����ϰ� ���� ����Ͻÿ�
        // ArrayList�� �ʱ�ȭ �ϴ� ����� ArrayList.clear

        ArrayList al = new ArrayList();
        int sum = 0;
        for(int i = 0; i < 10; i++){
            al.add(i,i+1);
            sum += (int) al.get(i);
        }
        System.out.println(sum);

    }
}
