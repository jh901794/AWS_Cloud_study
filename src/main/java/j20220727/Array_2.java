package j20220727;

public class Array_2 {
    public static void main(String[] args) {
        //자바는 초기에 크기를 지정해주어야 한다.
        int arr[] = new int[21];
        int i = 0, sum = 0;
        do {
            arr[i] = i+1;
            sum += arr[i];
        }while (++i < arr.length);
        System.out.println(sum);

        for(int j = 0; j<arr.length; j++){

        }
    }
}
