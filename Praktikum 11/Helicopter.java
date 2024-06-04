public class Helicopter extends Airplane {
  private double maxLoad;

  public Helicopter(double maxLoad) {
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
