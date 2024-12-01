package factory_pattern.CODE;

public class ShipFactory {
  EnemyShip getEnemyShip(String type) {
    if(type.equalsIgnoreCase("u")) {
      return new UFOShip();
    } else if (type.equalsIgnoreCase("R")){
        return new Rocket();
    } else if(type.equalsIgnoreCase("b")) {
      return new  BigUFO();
    }
    return null;
  }
}
