package greeter;

public class Greeter {
    private final GreeterStringFactory greeterStringFactory = new GreeterStringFactory();
    private GreeterString greeterString;


    public Greeter() {
        greeterString = new NormalGreeterString();
    }

    public String greet() {
        return greeterString.getGreet();
    }

    public void setFormality(String formality) {
        greeterString = greeterStringFactory.createGreeterString(formality);
    }
}