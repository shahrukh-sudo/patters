package strategy_pattern.CODE;

public interface ShippingStrategy {

  public Integer getPrice(Integer weight);
}


class ExpressShipping implements ShippingStrategy {

  @Override
  public Integer getPrice(Integer weight) {
    return 10 + 2 * weight;
  }
}


class RegularShipping implements ShippingStrategy {

  @Override
  public Integer getPrice(Integer weight) {
    return 5;
  }
}


class SameDay implements ShippingStrategy {

  @Override
  public Integer getPrice(Integer weight) {
    return 20 + 5 * weight;
  }
}


