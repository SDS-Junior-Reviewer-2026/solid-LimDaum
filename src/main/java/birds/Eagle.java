package birds;

public class Eagle implements FlaybleBird {
    private String currentLocation;
    private int numberOfFeathers;

    public Eagle(int initialFeatherCount) {
        this.numberOfFeathers = initialFeatherCount;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public int getNumberOfFeathers() {
        return numberOfFeathers;
    }

    public void molt() {
        this.numberOfFeathers -= 1;
    }

    public void fly() {
        this.currentLocation = "in the air";
    }
}