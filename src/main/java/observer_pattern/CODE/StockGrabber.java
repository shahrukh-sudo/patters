package observer_pattern.CODE;

import java.util.ArrayList;
import java.util.Arrays;


public class StockGrabber implements Subject {

  private ArrayList<Observer> observers = new ArrayList<>();
  private double ibmPrice;
  private double googPrice;
  private double appPrice;

  @Override
  public void register(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void unRegister(Observer observer) {
    int deleteIndex = observers.indexOf(observer);
    System.out.println("observer deleted at index: "+ deleteIndex );
    observers.remove(deleteIndex);
  }

  @Override
  public void notifyObserver() {
    for (Observer observer : observers) {
      observer.update(this.ibmPrice, this.googPrice, this.appPrice);
    }
  }

  public void setApplPrice(double applPrice) {
    this.appPrice = applPrice;
    notifyObserver();
  }

  public void setGoogPrice(double googPrice) {
    this.googPrice = googPrice;
    notifyObserver();
  }

  public void setIbmPrice(double ibmPrice) {
    this.ibmPrice = ibmPrice;
    notifyObserver();
  }
}
