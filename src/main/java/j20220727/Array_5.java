package j20220727;

public class Array_5 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("===============");
        int arr2[] = new int[10];
        for(int i = 0; i < arr2.length; i++){
            arr2[i] = i+1;
            System.out.println(arr2[i]);
        }
        System.out.println("===============");

        //2차원 배열 행(row) 과 열(coloum)로 이루어진다.
        int arr3[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = 0;
        for(int i = 0; i < arr3.length; i++){
            for(int j = 0; j < arr3[i].length; j++){
                sum += arr3[i][j];
            }
        }
        System.out.println(sum);


    }
}
