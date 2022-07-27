package j20220727;

public class Array_1 {
    public static void main(String[] args) {
        /*
            java에서의 배열 : index 0부터 시작.
        */
        int sum = 0;
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        for(int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
