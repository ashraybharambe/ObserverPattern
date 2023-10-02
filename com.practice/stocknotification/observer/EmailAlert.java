package stocknotification.observer;


import stocknotification.observable.StocksObservable;

public class EmailAlert implements NotificationAlertObserver{

    String emailId;
    StocksObservable stocksObservable;

    public EmailAlert(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(emailId, stocksObservable);
    }

    public void sendEmail(String emailId, StocksObservable stocksObservable) {
        System.out.println("sending email to " + emailId + " stock count: " + stocksObservable.getData());
    }
}
