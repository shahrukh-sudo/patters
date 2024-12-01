package factory_pattern.CODE;

public abstract class EnemyShip {

  public String name;
  public int damage;

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public void setName(String name) {
    this.name = name;
  }
}
