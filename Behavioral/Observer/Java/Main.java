package Behavioral.Observer.Java;

import Behavioral.Observer.Java.Class.DolarObserver;
import Behavioral.Observer.Java.Class.PesoArgObserver;
import Behavioral.Observer.Java.Class.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new PesoArgObserver(subject);
        new DolarObserver(subject);

        subject.setState(10);
        subject.setState(100);
    }
}
