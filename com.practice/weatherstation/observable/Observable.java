package weatherstation.observable;


import weatherstation.observer.Observer;

public interface Observable<T> {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver();

    public void setData(T data);

    public T getData();

}
