
/**
 * Write a description of class FighterJet here.
 *
 * @Daniel McElroy
 * @5/19/20
 */
public class FighterJet extends Airplane
{
    public FighterJet() {
        super(50000);
        super.speed = 1200;
        super.capacity = 1;
    }
    @Override
    public boolean supersonicCapability() {
        return true;
    }
    @Override
    public String useSpecialFunction() {
       return "Heat seeking missiles have been fired.";
    }
    @Override
    public String toString() {
        return "This Fighter Jet has supersonic capabliites and is currently going " 
        + speed + " miles per hour and carrying " 
        + capacity + " person at an altitude of " + altitude + " feet.";
    }
}
