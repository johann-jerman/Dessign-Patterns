package Behavioral.Observer.Java.Class;

public class DolarObserver extends  Observer{
    private double val = 1;

    public  DolarObserver(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    protected void update() {
        System.out.println(subject.getState() * val );
    }
}
