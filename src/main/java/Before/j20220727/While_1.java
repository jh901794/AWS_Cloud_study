package Before.j20220727;

public class While_1
{
    public static void main(String[] args) {
        int init=0,sum=0;
        int intvalue[] = new int[10];
        for(int i=0; i<intvalue.length; i++){
            intvalue[i]=i+1;
        }
        while (init++ <= 10){
            sum+=init;
        }
        System.out.println(init);
    }
}
