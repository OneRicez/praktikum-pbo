public class Truck extends Vehicle {
  private double maxLoad;

  public Truck(double maxLoad) {
      this.maxLoad = maxLoad;
  }

  @Override
  public double calcFuelEfficiency() {
      // Implement calculation
      return 0; // Placeholder
  }

  @Override
  public double calcTripDistance() {
      // Implement calculation
      return 0; // Placeholder
  }
}
