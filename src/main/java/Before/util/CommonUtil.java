package Before.util;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.Hashtable;

public class CommonUtil {
    static Hashtable hashtable = new Hashtable();

    public static void BaseCommonPNames(HttpServletRequest request){
        Enumeration enkey = request.getParameterNames();

        while (enkey.hasMoreElements()){
            String key = enkey.nextElement().toString();
            String[] values = request.getParameterValues(key);
            hashtable.put(key, values[0]);
        }
    }

    public String BaseCommonPNameSearch(String input_key){
        String value = null;
        Enumeration enkey = hashtable.keys();
        while (enkey.hasMoreElements()){
            String key_value = enkey.nextElement().toString();

            if(key_value.equals(input_key)){
                value = hashtable.get(key_value).toString();
            }
        }
        return value;
    }
}
