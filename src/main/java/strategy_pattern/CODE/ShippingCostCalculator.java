package strategy_pattern.CODE;

public class ShippingCostCalculator {

  private ShippingStrategy shippingStrategy;

  public void setShippingStrategy(ShippingStrategy shippingStrategy) {
    this.shippingStrategy = shippingStrategy;
  }

  // Calculate shipping cost based on the chosen strategy
  public double calculateShippingCost(Integer weight) {
    if (shippingStrategy == null) {
      throw new IllegalStateException("Shipping strategy not set!");
    }
    return shippingStrategy.getPrice(weight);
  }
}
