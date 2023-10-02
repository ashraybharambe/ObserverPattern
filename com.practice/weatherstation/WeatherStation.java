package weatherstation;


import weatherstation.observable.Observable;
import weatherstation.observable.WeatherObservable;
import weatherstation.observer.MobileDisplay;
import weatherstation.observer.Observer;
import weatherstation.observer.TvDisplay;

import java.util.ArrayList;

public class WeatherStation {

    public static void main(String[] args) {

        Observable<Double> weatherObservable = new WeatherObservable(new ArrayList<>());
        Observer tvDisplayObserver = new TvDisplay(weatherObservable, "weather");
        Observer mobileDisplayObserver = new MobileDisplay(weatherObservable, "home");
        weatherObservable.addObserver(tvDisplayObserver);
        weatherObservable.addObserver(mobileDisplayObserver);

        weatherObservable.setData(25.5);
        weatherObservable.setData(20.3);
        weatherObservable.setData(20.3);
        weatherObservable.setData(28.9);
    }

}
