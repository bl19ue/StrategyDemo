import java.util.HashMap;
import java.util.Map;
public class Database
{
    public static Map<String , String> items = new HashMap<String, String>();
    public static Map<String , String> barcode_list = new HashMap<String, String>();
    public static Map<String , String> keycode_list = new HashMap<String, String>();
    public Database(){
        items.put("apple", ".70");
        items.put("banana", ".40");
        items.put("wine", ".20");
        
        barcode_list.put("123321", "apple");
        barcode_list.put("123323", "banana");
        barcode_list.put("111232", "wine");
        
        keycode_list.put("121", "apple");
        keycode_list.put("123", "banana");
        keycode_list.put("111", "wine");
    }
        
    public String getPrice(String item){
        for(String key: items.keySet()){
            if(key.equals(item)){
                System.out.println(key + ":" + items.get(key));
                return items.get(key);
            }
        }
        return "";
    }
    
}
