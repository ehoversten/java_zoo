public class GorillaTest {
  public static void main(String[] args) {
    Gorilla koko = new Gorilla();
    koko.throwSomething();
    koko.eatBananas();
    koko.climb();
    koko.displayEnergy();

    Bat vlad = new Bat();
    vlad.displayEnergy();
    vlad.fly();
    vlad.eatHumans();
    vlad.attackTown();
    vlad.displayEnergy();
  }

}
