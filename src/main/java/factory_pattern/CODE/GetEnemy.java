package factory_pattern.CODE;

public class GetEnemy {

  public static void main(String[] args) {
    ShipFactory factory = new ShipFactory();
    //specify type U or R
    String type = "b";
    EnemyShip ship = factory.getEnemyShip(type);
    System.out.println("I am " +ship.name +"\nBe aware i can do " +ship.damage);
  }
}
