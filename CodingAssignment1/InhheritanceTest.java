
/**
 * Write a description of class InhheritanceTest here.
 *
 * @Daniel McElroy
 * @5/18/21
 */
public class InhheritanceTest
{
    public static void main (String[] args) {
        Vehicle vehicle1 = new Vehicle(25, 5);
        Airplane airplane1 = new Airplane(30000);
        FighterJet jet1 = new FighterJet();
        
        System.out.println("TESTING OVERRIDEN TOSTRING METHODS");
        System.out.println(vehicle1);
        System.out.println(airplane1);
        System.out.println(jet1);
        System.out.println("-----------------------------------------");
        System.out.println("");
        
        System.out.println("TESTING OVERRIDEN SPECIALFUNCTION METHODS");
        System.out.println(vehicle1.useSpecialFunction());
        System.out.println(airplane1.useSpecialFunction());
        System.out.println(jet1.useSpecialFunction());
        System.out.println("-----------------------------------------");
        System.out.println("");
        
        System.out.println("TESTING OVERRIDEN TRAVELCAPABILITY FUNCTIONS");
        System.out.println(vehicle1.travelCapability());
        System.out.println(airplane1.travelCapability());
        System.out.println(jet1.travelCapability());
        System.out.println("-----------------------------------------");
        System.out.println("");
        
        System.out.println("TESTING OVERRIDEN SUPERSONIC CAPABILITY FUNCTIONS");
        System.out.println(airplane1.supersonicCapability());
        System.out.println(jet1.supersonicCapability());
        System.out.println("-----------------------------------------");
    }
}
