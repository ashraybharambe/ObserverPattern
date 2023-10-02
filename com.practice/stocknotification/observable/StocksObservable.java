package stocknotification.observable;


import stocknotification.observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscriber();
    public void setData(int stockCount);
    public int getData();

}
