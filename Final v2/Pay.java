
/**
 * Write a description of class RealSubject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pay extends RealSubject implements Subject
{
    public void pay(double cost, String credit_card)
    {
        if(credit_card.equals("1222122212221222")){
            super.pay(cost, credit_card);
        }
        else{
            System.out.println("Unauthorized");
        }
    }
}
