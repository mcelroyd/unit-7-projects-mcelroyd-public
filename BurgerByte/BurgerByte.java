
/**
 * Write a description of class BurgerByte here.
 *
 * @Daniel McElroy
 * @5/20/21
 */
import java.util.ArrayList;
import java.util.List;

public class BurgerByte {

    protected String location;
    protected Manager manager;
    protected List<Employee> staff;
    protected boolean isOpen;

    public BurgerByte(String locn, Manager m) {
        location = locn;
        manager = m;
        staff = new ArrayList<>();
    }

    // getters
    public String getLocation() { return location; }
    public Manager getManager() { return manager; }
    public List<Employee> getStaff() { return staff; }
    public boolean isOpen() { return isOpen; }

    // EFFECTS: "opens" this restaurant, i.e. set isOpen to true
    public void openRestaurant() {
        isOpen = true;
    }

    // EFFECTS: sets the isOpen field to false, and sends all employees home (off work)
    public void closeRestaurant() {
        isOpen = false;
        for (Employee e : staff) {
            e.leaveWork();
        }
        manager.leaveWork();
    }

    // REQUIRES: c must not be in this cashiers or this BurgerByte's Manager's cashiers
    // MODIFIES: this
    // EFFECTS: adds the given cashier to this cashiers
    public void addStaff(Employee e) {
        staff.add(e);
    }

    // REQUIRES: c must be in this cashiers and this BurgerByte's Manager's cashiers
    // MODIFIES: this
    // EFFECTS: removes the given cashier from this cashiers
    public void removeStaff(Employee e) {
        staff.remove(e);
    }

    // EFFECTS: computes wages for all employees, prints them out in this format
    //          Name: ______, Salary: _______ for each employee
    public void computeStaffWages() {
        for (Employee e : staff) {
            System.out.println("Name: " + e.getName() +", Salary: " + e.computeWage());
        }
        System.out.println("Name: " + manager.getName() +", Salary: " + manager.computeWage());
    }


}