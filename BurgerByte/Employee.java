
/**
 * Write a description of class Employee here.
 *
 * @Daniel McElroy
 * @5/20/21
 */
public abstract class Employee
{
    public static final double BASE_WAGE = 10.00;
    protected String name;
    protected int age;
    protected double hoursWorked;
    protected boolean atWork;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { 
        return name; 
    }
    public int getAge() { 
        return age; 
    }
    public boolean isAtWork() { 
        return atWork; 
    }
    public double getHoursWorked() { 
        return hoursWorked; 
    }
    public void logHoursWorked(double hours) {
        hoursWorked += hours;
    }
    public void startWork(double hours) {
        logHoursWorked(hours);
        atWork = true;
    }
    public void leaveWork() {
        atWork = false;
    }
    public double computeWage() {
        return hoursWorked * BASE_WAGE;
    }
}