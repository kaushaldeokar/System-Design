package Observable;

import Observer.ObserverInterface;

public interface ObservableInterface {

    public void addObserver(ObserverInterface observer);
    public void removeObserver(ObserverInterface observer);
    public void setData(Integer newStockCount);
    public Integer getData();
    public void notifyObservers();

}
