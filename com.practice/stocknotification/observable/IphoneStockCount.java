package stocknotification.observable;



import stocknotification.observer.NotificationAlertObserver;

import java.util.List;

public class IphoneStockCount implements StocksObservable {
    List<NotificationAlertObserver> observerList;
    int stockCount = 0;

    public IphoneStockCount(List<NotificationAlertObserver> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void add(NotificationAlertObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        this.observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setData(int stockCount) {
        int existingStockCount = this.getData();
        this.stockCount = stockCount;
        if(existingStockCount == 0) {
            notifySubscriber();
        }
    }

    @Override
    public int getData() {
        return this.stockCount;
    }
}
