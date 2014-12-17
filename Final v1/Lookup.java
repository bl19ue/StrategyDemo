
/**
 * Write a description of class Lookup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lookup extends ItemList
{
    String lookupid;
    Database database;
    public Lookup(String lookupid, Database database){
        this.lookupid = lookupid;
        this.database = database;
    }
    public void addToList(){
        String price = checkItemByLookUp(lookupid);
        cost += Double.parseDouble(price);
    }
    
    public String checkItemByLookUp(String lookupid){
        
        for(String key: Database.barcode_list.keySet()){
            if(key.equals(lookupid)){
                return database.getPrice(Database.barcode_list.get(key));
            }
        }
        return "";
    }
}
