package Method;

public class Truck {
    public void load(Puffs p) {
        System.out.println(p.name + " were loaded into the truck.");
    }

    public void transport(String destination) {
        System.out.println("The truck transports the goods to: " + destination);
    }
}