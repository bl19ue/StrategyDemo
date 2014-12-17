
/**
 * Write a description of class Scan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scan extends ItemList
{
    String barcode;
    Database database;
    public Scan(String barcode, Database database){
        this.barcode = barcode;
        this.database = database;
    }
    public void addToList(){
        String price = checkItemByBarcode(barcode);
        cost += Double.parseDouble(price);
    }
    
    public String checkItemByBarcode(String barcode){
        
        for(String key: Database.barcode_list.keySet()){
            if(key.equals(barcode)){
                return database.getPrice(Database.barcode_list.get(key));
            }
        }
        return "";
    }
    
}
