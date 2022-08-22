package Before.j20220812;

import java.util.ArrayList;
import java.util.Hashtable;

public class coupangBean {
String[] coupang = {"로켓배송", "로켓프레시", "쿠팡비즈", "로켓직구", "골드박스", 
	"와우회원할인", "이벤트/쿠폰", "기획전", "여행/티켓"};
static  int index = 0;

ArrayList list = new ArrayList();
Hashtable board = new Hashtable();
public ArrayList getList() {
	if(list == null) {
		new ArrayList();
	}
	return list;
}
public void setlist(Object input) {
	list.add(input);
}
public void setHash(String choiceboard, Object input) {
	this.board.put(choiceboard,input);
}

public coupangBean(String coupang1, String coupang2, String coupang3, String coupang4,
		String coupang5,String coupang6,String coupang7,String coupang8,String coupang9) {
	this.setHash("board1",new coupangBean(++index, coupang1, coupang2, coupang3, coupang4, 
			coupang5, coupang6, coupang7, coupang8, coupang9));
}
public coupangBean(int index,String coupang1, String coupang2, String coupang3, String coupang4,
		String coupang5,String coupang6,String coupang7,String coupang8,String coupang9) {

}

public String[] getCoupang() {
	return coupang;
}

public void setCoupang(String[] coupang) {
	Hashtable table = new Hashtable();
	
	for(int i = 0; i <coupang.length; i++) {
		table.put(coupang[i], coupang[i]);
		
	}
}


}
