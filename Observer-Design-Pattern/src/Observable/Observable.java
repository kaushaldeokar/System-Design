package Observable;

import Observer.Observer;
import Observer.ObserverInterface;

import java.util.ArrayList;
import java.util.List;

public class Observable implements ObservableInterface{



    List<ObserverInterface>registeredObserver= new ArrayList<>();

    Integer stockCount ;

    public Observable(Integer stockCount){
        this.stockCount=stockCount;
    }

    @Override
    public void addObserver(ObserverInterface observer) {
        registeredObserver.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        registeredObserver.remove(observer);
    }

    @Override
    public void setData(Integer data){
        if(stockCount==0){
            notifyObservers();
        }
        this.stockCount=stockCount+data;
        System.out.println("new stock count : "+stockCount);
    }

    public Integer getData(){
        return stockCount;
    }


    public void notifyObservers(){
        for(var observer:registeredObserver){
            observer.update();
        }
    }


}
