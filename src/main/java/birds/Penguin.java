package birds;

public class Penguin implements SwimableBird {
    private String currentLocation;
    private int numberOfFeathers;

    public Penguin(int initialFeatherCount) {
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

    public void swim() {
        this.currentLocation = "in the water";
    }
}