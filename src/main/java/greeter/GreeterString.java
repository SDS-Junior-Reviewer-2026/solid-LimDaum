package greeter;

public interface GreeterString {
    public String getGreet();
}

class NormalGreeterString implements GreeterString {
    public String getGreet() {
        return "Hello.";
    }
}

class FormalGreeterString implements GreeterString {
    public String getGreet() {
        return "Good evening, sir.";
    }
}

class CasualGreeterString implements GreeterString {
    public String getGreet() {
        return "Sup bro?";
    }
}

class IntimateGreeterString implements GreeterString {
    public String getGreet() {
        return "Hello Darling!";
    }
}

class GoHomeGreeterString implements GreeterString {
    public String getGreet() {
        return "I wanna go home...";
    }
}
