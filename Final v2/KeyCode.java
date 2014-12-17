
/**
 * Write a description of class KeyCode here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyCode extends ItemList
{
    String keycode;
    Database database;
    public KeyCode(String keycode, Database database){
        this.keycode = keycode;
        this.database = database;
    }
    public void addToList(){
        String price = checkItemByKeycode(keycode);
        cost += Double.parseDouble(price);
    }
    
    public String checkItemByKeycode(String keycode){
        for(String key: Database.keycode_list.keySet()){
            if(key.equals(keycode)){
                return database.getPrice(Database.keycode_list.get(key));
            }
        }
        return "";
    }
}
