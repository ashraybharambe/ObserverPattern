package weatherstation.observable;

import weatherstation.observer.Observer;

import java.util.List;

public class WeatherObservable implements Observable<Double> {
    private List<Observer> observerList;
    private Double temperature = 0.0;

    public WeatherObservable(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : this.observerList) {
            observer.update();
        }
    }

    @Override
    public void setData(Double temperature) {
        if(this.temperature.doubleValue() != temperature) {
            this.temperature = temperature;
            notifyObserver();
        }
    }

    @Override
    public Double getData() {
        return this.temperature;
    }

}
