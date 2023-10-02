package weatherstation.observer;


import weatherstation.observable.Observable;

public class MobileDisplay implements Observer{
    Observable<Double> weatherObservable;
    String screen;

    public MobileDisplay(Observable<Double> weatherObservable, String screen) {
        this.weatherObservable = weatherObservable;
        this.screen = screen;
    }

    @Override
    public void update() {
        System.out.println("On mobile screen: " + screen);
        System.out.println("Weather: " + this.weatherObservable.getData() + "C");
    }
}
