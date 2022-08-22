package Before.j20220727;

public class For_While_Do_While {
    public static void main(String[] args) {
        int arr[] = new int[21];
        int E_sum = 0, O_sum = 0, count = 0;

        //for��
        for(int i = 0; i<arr.length; i++){
            arr[i] = i+1;
            if(arr[i]%2 == 0){
                E_sum += arr[i];
            }else{
                O_sum += arr[i];
            }
        }
        System.out.println("for");
        System.out.println("E_sum = " + E_sum);
        System.out.println("O_sum = " + O_sum);
        System.out.println("==========================");


        E_sum = 0; O_sum = 0;
        while (count < arr.length){
            arr[count] = count+1;
            if(arr[count]%2 == 0){
                E_sum += arr[count];
            }else{
                O_sum += arr[count];
            }
            count++;
        }
        System.out.println("while");
        System.out.println("E_sum = " + E_sum);
        System.out.println("O_sum = " + O_sum);
        System.out.println("==========================");


        E_sum = 0; O_sum = 0; count = 0;

        do {
            arr[count] = count+1;
            if(arr[count]%2 == 0){
                E_sum += arr[count];
            }else{
                O_sum += arr[count];
            }
        }while (++count < arr.length);
        System.out.println("do");
        System.out.println("E_sum = " + E_sum);
        System.out.println("O_sum = " + O_sum);
    }
}
