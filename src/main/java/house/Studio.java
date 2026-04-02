package house;

public class Studio extends Apartment {
    public Studio() {
        this.numberOfBedrooms = 0;
    }

    public void setSquareFootage(int sqft) {
        this.getSquareFootage = sqft;
    }

    public void upgradeSquareFootage() {
        this.getSquareFootage += 40;
    }

    public void upgradeBedroomNumber() {

    }
}