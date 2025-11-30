import Method.Factory;
import Method.Puffs;
import Method.Truck;

public class Exercitiul8 {

    public static void main(String[] args) {

        Factory fabrica = new Factory();
        Puffs cristinel = fabrica.produce("Cristinel");
        Puffs cristinuta = fabrica.produce("Cristinuta");

        cristinel.printLocation("The production factory");
        cristinuta.printLocation("The production factory");

        Truck truck = new Truck();
        truck.load(cristinel);
        truck.load(cristinuta);

        truck.transport("Chisinau");

        String[] shops = {"Metro", "Nr1", "Linella"};

        for (String shop : shops) {
            truck.transport(shop);
            cristinel.printLocation(shop);
            cristinuta.printLocation(shop);
            System.out.println("--------------------------------");
        }
    }
}
