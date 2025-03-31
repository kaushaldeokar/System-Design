package Observer;

import Observable.ObservableInterface;

public class Observer implements ObserverInterface{

    String email;
    ObservableInterface observable;

    public Observer(String email,ObservableInterface observable){
        this.email=email;
        this.observable=observable;
    }


    @Override
    public void update(){
        sendAlert(email,"Hi User stock is available available Quantity : "+observable.getData());
    }

    public void sendAlert(String email,String msg){
        System.out.println("Alert SENT to : "+email+"with MSG : "+msg);
    }
}
