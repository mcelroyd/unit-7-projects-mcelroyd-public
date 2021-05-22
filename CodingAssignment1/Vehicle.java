
/**
 * Write a description of class Vehicle here.
 *
 * @Daniel McElroy
 * @5/18/21
 */
public class Vehicle
{
    protected int speed;
    protected int capacity;
    protected String type = "";
    public Vehicle(int speed, int capacity){
        this.speed = speed;
        this.capacity = capacity;
    }
    public int getSpeed() {
        return speed;
    }
    public int getCapacity() {
        return capacity;
    }
    public String travelCapability() {
        return "Can travel over land.";
    }
    public String useSpecialFunction() {
        return "We are now travelling towards your destination";
    }
    public String toString() {
        return "This Vehicle is going " + speed + " miles per hour and carrying " 
        + capacity + " people.";
    }
}
