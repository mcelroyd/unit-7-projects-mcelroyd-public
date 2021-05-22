
/**
 * Write a description of class Airplane here.
 *
 * @Daniel McElroy
 * @5/18/21
 */
public class Airplane extends Vehicle
{
    protected int altitude;
    public Airplane(int altitude){
        super(583, 200);
        this.altitude = altitude;
    }
    public int getAltitude() {
        return altitude;
    }
    @Override
    public String travelCapability() {
        return "Can travel through air.";
    }
    @Override
    public String useSpecialFunction() {
       return "Landing gear have been retracted.";
    }
    public boolean supersonicCapability() {
        return false;
    }
    @Override
    public String toString() {
        return "This Airplane is going " + speed + " miles per hour and carrying " 
        + capacity + " people at an altitude of " + altitude + " feet.";
    }
}
