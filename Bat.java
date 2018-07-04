public class Bat extends Mammal {
  private int energyLevel = 300;

  public Bat() { }

  public int displayEnergy() {
    System.out.println("Bat Energy: " + energyLevel);
    return energyLevel;
  }

  public void eatHumans() {
    energyLevel += 25;
    System.out.println("Yum ... Human, gained 25 energy");
  }

  public void fly() {
    energyLevel -= 50;
    System.out.println("I can Fly, I can Fly!!!, lost 50 energy");
  }

  public void attackTown() {
    energyLevel -= 100;
    System.out.println("Fire!! Village burned, lost 100 energy");
  }

}
