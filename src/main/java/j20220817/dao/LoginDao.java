package j20220817.dao;

import java.util.Hashtable;

//dao: data access object(업무(비즈니스로직))
//mvc:model(업무)controller:리모컨 v:view->front

public class LoginDao {
   Hashtable table = new Hashtable();
   
   
   public boolean CheckLogin(String userid, String passwd,String email) {
      
      if(userid.equals("kim") && passwd.equals("1234") && email.equals("1234")) {
         return true;   
      }else {
         return false;
      }
      
      
   }
}