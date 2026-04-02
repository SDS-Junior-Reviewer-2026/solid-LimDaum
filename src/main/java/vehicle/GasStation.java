package vehicle;

public class GasStation {
    public void reFuel(Vehicle vehicle, int fuel) {
        if (vehicle.getRemainingFuel() + fuel < vehicle.getMaxFuel()) {
            vehicle.addFuel(fuel);
        }
        else {
            vehicle.setRemainingFuel(vehicle.getMaxFuel());
        }
    }
}