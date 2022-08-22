package Before.j20220727;

public class Array_1 {
    public static void main(String[] args) {
        /*
            java������ �迭 : index 0���� ����.
        */
        int sum = 0;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
