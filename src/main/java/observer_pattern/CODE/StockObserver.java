package observer_pattern.CODE;

public class StockObserver implements Observer{

  double ibmPrice;
  double googPrice;
  double applPrice;

  StockGrabber stockGrabber ;

  private static int observerIdTracker;

  private int observerId;

  public StockObserver(StockGrabber stockGrabber){
    this.stockGrabber = stockGrabber;
    this.observerId = ++observerIdTracker;
    System.out.println("new observer added" + this.observerId);

  }
  @Override
  public void update(double ibmPrice, double googPrice, double appPrice) {
    this.applPrice = appPrice;
    this.googPrice = googPrice;
    this.ibmPrice = ibmPrice;
    printPrices();

  }

  public void printPrices() {
    System.out.println(
        "\nObserver_id " + observerId + "\nibmPrice " + ibmPrice + "\ngoogPrice " + googPrice
            + "\napplPrice " + applPrice);
  }
}
