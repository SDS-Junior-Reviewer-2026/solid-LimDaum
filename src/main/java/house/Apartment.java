package house;

abstract class Apartment {
    protected int getSquareFootage;
    protected int numberOfBedrooms;

    public int getSquareFootage() {
        return getSquareFootage;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    abstract void setSquareFootage(int sqft);
    abstract void upgradeSquareFootage();
    abstract void upgradeBedroomNumber();
}