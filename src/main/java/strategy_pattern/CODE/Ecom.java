package strategy_pattern.CODE;

public class Ecom {

  public static void main(String[]args) {
    ShippingCostCalculator calculator = new ShippingCostCalculator();
    int weight = 10;

    // Use Regular Shipping
    calculator.setShippingStrategy(new RegularShipping());
    System.out.println("Regular Shipping Cost: $" + calculator.calculateShippingCost(weight));

    // Use Express Shipping
    calculator.setShippingStrategy(new ExpressShipping());
    System.out.println("Express Shipping Cost: $" + calculator.calculateShippingCost(weight));

    // Use Same-Day Shipping
    calculator.setShippingStrategy(new SameDay());
    System.out.println("Same-Day Shipping Cost: $" + calculator.calculateShippingCost(weight));
  }
}
