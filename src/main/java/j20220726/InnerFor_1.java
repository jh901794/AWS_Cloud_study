package j20220726;

public class InnerFor_1 {
	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i != 3 & i != 7) {
					System.out.printf("\t %d  x %d = %2d ", i, j, i * j);
				}
			}
			if(i!= 3 & i!= 7) {
				System.out.println();
			}
		}
		System.out.println("\t =========================================================================================================");
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				if (!(j == 5 | j == 8)) {
					System.out.printf("\t %d  x %d = %2d ", j, i, i * j);
				}
			}
			System.out.println();
		}
	}
}