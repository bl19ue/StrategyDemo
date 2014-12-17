
/**
 * Abstract class ItemList - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
import java.util.*;
public abstract class ItemList
{
    public static Map<String , String> order_list = new HashMap<String, String>();
    public static double cost = 0;
    public abstract void addToList();
    public double getCost(){
        return cost;
    }
    
}
