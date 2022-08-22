package Before.j20220727;

public class Array_2 {
    public static void main(String[] args) {
        //�ڹٴ� �ʱ⿡ ũ�⸦ �������־�� �Ѵ�.
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
