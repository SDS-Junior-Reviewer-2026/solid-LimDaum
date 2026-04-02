package greeter;

public class GreeterStringFactory {
    GreeterString greeterString;

    public GreeterString createGreeterString(String formality) {
        return switch(formality) {
            case "formal" -> new FormalGreeterString();
            case "casual" -> new CasualGreeterString();
            case "intimate" -> new IntimateGreeterString();
            case "gohome"  -> new GoHomeGreeterString();
            default -> new NormalGreeterString();
        };
    }
}
