package Method;

public class Factory {
    public Puffs produce(String name) {
        System.out.println("Puffs are produced " + name + " in the factory...");
        return new Puffs(name);
    }
}
