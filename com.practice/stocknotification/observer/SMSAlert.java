package stocknotification.observer;


import stocknotification.observable.StocksObservable;

public class SMSAlert implements NotificationAlertObserver{

    String mobNumber;
    StocksObservable stocksObservable;

    public SMSAlert(String mobNumber, StocksObservable stocksObservable) {
        this.mobNumber = mobNumber;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMessage(mobNumber, stocksObservable);
    }

    public void sendMessage(String mobNumber, StocksObservable stocksObservable) {
        System.out.println("sending sms to " + mobNumber + " stock count: " + stocksObservable.getData());
    }
}
