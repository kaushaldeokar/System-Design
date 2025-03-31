import Observable.Observable;
import Observer.Observer;

public class Main {
    public static void main(String[] args) {

        //iphone stock on Amazon
        Observable iphoneStock = new Observable(10);

        //user subscribed the stock
        Observer kaushal = new Observer("kaushald@tejasnetworks.com",iphoneStock);

        // add user to subscriber list

        iphoneStock.addObserver(kaushal);
        iphoneStock.setData(-10);



    }
}