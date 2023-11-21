package Behavioral.Observer.Java.Class;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notofyAllObserver();
    }
    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void notofyAllObserver (){
        observers.forEach(observer -> observer.update());
    }
}
