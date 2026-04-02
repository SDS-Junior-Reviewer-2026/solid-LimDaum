package birds;

public interface Bird {
    public void molt();
}

interface FlaybleBird extends Bird{
    public void fly();
}

interface SwimableBird extends Bird{
    public void swim();
}