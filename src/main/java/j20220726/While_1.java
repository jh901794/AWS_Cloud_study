package j20220726;

public class While_1 {

	public static void main(String[] args) {
		int init=0, sum=0, sum1 = 0;
		
//		while (init<= 10) {
//			System.out.println("무한반복");
//		}
//		netstat -abon | more
//		taskkill /F /im 종료시킬 프로그램명		
		
//		while (++init <=10) {
//			sum += init;
//		}
//		System.out.println(sum);
		
		while(++init <=21) {
			if(init%2 == 0 & init != 4 & init !=6  & init != 10 & init!= 20) {
				sum += init;
			}
			if(init%2 == 1 & init != 7  & init != 11 & init!= 19) {
				sum1 += init;
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
	}
}
