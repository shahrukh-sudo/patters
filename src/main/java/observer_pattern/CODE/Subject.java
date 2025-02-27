package observer_pattern.CODE;

public interface Subject {
  public void register(Observer observer);
  public void unRegister(Observer observer);
  public void notifyObserver();
}
