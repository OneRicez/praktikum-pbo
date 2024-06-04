public class SeaPlane extends Airplane {
  private double maxLoad;

  public SeaPlane(double maxLoad) {
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
