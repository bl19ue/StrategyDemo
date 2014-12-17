
/**
 * Write a description of class BuildOrder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuildOrder
{
    public static void main(String[] args){
        ItemList item;
        Database database = new Database();
        item = new Scan("123321", database);
        item.addToList();
        
        item = new KeyCode("121", database);
        item.addToList();

        item = new Scan("111232", database);
        item.addToList();
        
        item = new KeyCode("123", database);
        item.addToList();
        
        item = new Scan("111232", database);
        item.addToList();
        
        
        Pay pay = new Pay();
        pay.pay(item.getCost());
    }
}
