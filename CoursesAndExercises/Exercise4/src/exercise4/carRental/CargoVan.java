package exercise4.carRental;

public class CargoVan extends Van {
    private double maxLoad; // in liters

    public CargoVan(String regNo, String model, int year, double price, double height, int noOfSeats, double maxLoad) {
        super(regNo, model, year, price, height, noOfSeats);
        this.maxLoad = maxLoad;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(double maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public double getPricePerDay() {
        return this.getPrice() * 1.1; // 110% of the price
    }
}
