package observer_pattern.CODE;

public class GrabStock {

  public static void main(String[] args) {
    StockGrabber stockGrabber = new StockGrabber();
    StockObserver observer1  = new StockObserver(stockGrabber);

    stockGrabber.register(observer1);
    stockGrabber.setIbmPrice(120.0);
    stockGrabber.setGoogPrice(130.0);
    stockGrabber.setApplPrice(115.0);

    StockObserver observer2  = new StockObserver(stockGrabber);
    stockGrabber.register(observer2);
    stockGrabber.unRegister(observer1);
    System.out.println("-------No observer 1-----");
    stockGrabber.setIbmPrice(185.0);
    stockGrabber.setApplPrice(0.0);



  }
}
