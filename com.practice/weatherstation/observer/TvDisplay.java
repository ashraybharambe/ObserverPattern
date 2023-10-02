package weatherstation.observer;

import weatherstation.observable.Observable;


public class TvDisplay implements Observer {
    Observable<Double> weatherObservable;
    String channel;

    public TvDisplay(Observable<Double> weatherObservable, String channel) {
        this.weatherObservable = weatherObservable;
        this.channel = channel;
    }

    @Override
    public void update() {
        updateDisplay(weatherObservable.getData());
    }

    private void updateDisplay(double temperature) {
        System.out.println("On TV channel: " + channel);
        System.out.println("Weather: " + this.weatherObservable.getData() + "C");
    }
}
