package Before.questionpool;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예약어는 변수명으로 사용불가능하다. -- 적색 단어들
		String name = "김재훈";
		String address = "북구";
		int age = 24;
		
		System.out.println("현재");
		System.out.println("이름 : " + name);
		System.out.println("주소 :"+ address);
		System.out.println("현재 나이는 : "+age + "세");
		
		System.out.println();
		age += 10;
		System.out.println("+10년");
		System.out.println("현재 나이는 : "+age + "세");
		
		System.out.println();
		age -= 10;
		System.out.println("+10-10년");
		System.out.println("현재 나이는 : "+age + "세");
		
		System.out.println();
		age += 20;
		System.out.println("20년 후");
		System.out.println("현재 나이는 : "+age + "세");
		
		System.out.println();
		age -= 20;
		System.out.println("현재");
		System.out.println("현재 나이는 : "+age + "세");

		
		
	}
}
