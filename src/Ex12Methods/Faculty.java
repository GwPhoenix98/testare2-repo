package Ex12Methods;

public class Faculty extends Student {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public void action() {
        System.out.println(getName() + " studies physics");
    }
}
