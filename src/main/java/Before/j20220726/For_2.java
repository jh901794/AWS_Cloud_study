package Before.j20220726;

public class For_2 {
	public static void main(String[] args) {
//		int init = 2;
		int sum = 0;
		int sum1 = 0;
//		if (init % 2 == 0) {
//			System.out.println("짝수만 선택");
//		}
		for (int i = 0; i < 21; i++) {
			if (i % 2 == 0) {
				if (i != 4 & i != 6 & i != 10 & i != 20) {
					sum += i;
				}
			} else {
				if (!(i == 7 | i == 11 | i == 19)) {
					sum1 += i;
				}	
			}
		}
		System.out.println(sum);
		System.out.println(sum1);
	}
}
