package Behavioral.Observer.Java.Class;

public class PesoArgObserver extends Observer{
    private double val = 1000;

    public  PesoArgObserver(Subject subject){
            this.subject = subject;
            this.subject.addObserver(this);
    }

    @Override
    protected void update() {
        System.out.println(subject.getState() * val );
    }
}
