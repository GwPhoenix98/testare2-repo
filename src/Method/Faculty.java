package Method;

public class Faculty extends Student {

    public Faculty(String name) {
        super(name);
    }

    public void action() {
        System.out.println(getName() + " studies physics");
    }
}
