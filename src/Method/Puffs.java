package Method;

public class Puffs {
    String name;

    public Puffs(String name) {
        this.name = name;
    }

    public void printLocation(String location) {
        System.out.println(name + " is now at: " + location);
    }
}