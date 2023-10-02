package stocknotification;


import stocknotification.observable.IphoneStockCount;
import stocknotification.observable.StocksObservable;
import stocknotification.observer.EmailAlert;
import stocknotification.observer.NotificationAlertObserver;
import stocknotification.observer.SMSAlert;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        StocksObservable iphone = new IphoneStockCount(new ArrayList<>());
        NotificationAlertObserver smsAlert = new SMSAlert("123", iphone);
        NotificationAlertObserver emailAlert = new EmailAlert("abc@gmail.com", iphone);

        iphone.add(smsAlert);
        iphone.add(emailAlert);

        iphone.setData(100);
        iphone.setData(0);
        iphone.setData(13);

    }
}
