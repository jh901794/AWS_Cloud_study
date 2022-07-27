package questionpool;

public class If_Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr_age = {21, 37, 46, 52};
		
		for(int i = 0; i<arr_age.length; i++) {
			cheak(arr_age[i]);
			System.out.println();
		}
	}
	
	public static void cheak(int age) {
		if (age <= 30) {
			System.out.println("20대 입니다.");
		} else if (age <= 40) {
			System.out.println("30대 입니다.");
		} else if (age <= 50) {
			System.out.println("40대 입니다.");
		} else if (age <= 60) {
			System.out.println("50대입니다.");
		}

		if (age <= 30) {
			System.out.println("20대 입니다.");
		} if (age <= 40 && age > 30) {
			System.out.println("30대 입니다.");
		} if (age <= 50 && age > 40) {
			System.out.println("40대 입니다.");
		} if (age <= 60 && age > 50) {
			System.out.println("50대입니다.");
		}
	}

}
