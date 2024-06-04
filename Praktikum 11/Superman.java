public class Superman extends Kryptonian implements IFlyer {
  private String name;

  public Superman(String name) {
      this.name = name;
  }

  public String getName() {
      return name;
  }

  @Override
  public void takeOff() {
      System.out.println("Superman taking off");
  }

  @Override
  public void land() {
      System.out.println("Superman landing");
  }

  @Override
  public void fly() {
      System.out.println("Superman flying");
  }

  public void leapBuilding() {
      System.out.println("Superman leaping buildings");
  }

  public void stopBullet() {
      System.out.println("Superman stopping bullets");
  }

  @Override
  public void eat() {
      System.out.println("Nasi Goreng");
  }
}
