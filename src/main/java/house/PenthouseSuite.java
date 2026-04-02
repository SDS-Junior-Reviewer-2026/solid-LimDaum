package house;

public class PenthouseSuite extends Apartment {
    public PenthouseSuite() {
        this.numberOfBedrooms = 4;
    }

    public void setSquareFootage(int sqft) {
        this.getSquareFootage = sqft;
    }

    public void upgradeSquareFootage() {
        this.getSquareFootage += 40;
    }

    public void upgradeBedroomNumber() {
        this.numberOfBedrooms += 1;
    }
}