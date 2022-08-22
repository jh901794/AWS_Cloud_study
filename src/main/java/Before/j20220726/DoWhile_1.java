package Before.j20220726;
public class DoWhile_1 {
	public static void main(String[] args) {
		// 한번은 무조건 실행한다. ture면 while 실행.
		int init = 0;
		int sum = 0, sum1 = 0;
		do {
			if (init % 2 == 0 & init != 4 & init != 6 & init != 10 & init != 20) {
				sum += init;
			}
			if (init % 2 == 1 & init != 7 & init != 11 & init != 19) {
				sum1 += init;
			}
		} while (++init <= 21);

		System.out.println(sum);
		System.out.println(sum1);
	}
}