package j20220726;

public class Switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch 조건이 맞는 case를 실행한다. case는 break로 종료한다.
		// default는 조건에 맞는 case가 없는 경우 실행한다.

		switch (1) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		default:
			System.out.println("값이 없습니다.");
			break;
		}

		System.out.println();

		String name = "김재훈";

		switch (name) {
		case "김재훈":
			System.out.println(name + "검색됨");
			break;
		case "아무개":
			System.out.println(name + "검색됨");
			break;
		case "홍길동":
			System.out.println(name + "검색됨");
			break;
		default:
			break;
		}

		char firstname = '김';

		switch (firstname) {
		case '김':
			System.out.println(firstname + "검색됨");
			break;
		case '이':
			System.out.println(firstname + "검색됨");
			break;
		case '박':
			System.out.println(firstname + "검색됨");
			break;
		}

	}

}
// 싱글쿼터는 문자를 나타냄.
// 문자 + 문자는 문자열.
// char + char 일 경우 String으로 작성해야됨.
