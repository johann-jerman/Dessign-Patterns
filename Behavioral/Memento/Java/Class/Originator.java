package Behavioral.Memento.Java.Class;

public class Originator {
    private Game state;

    public Game getState() {
        return state;
    }

    public void setState(Game state) {
        this.state = state;
    }

    public Memento save (){
        return new Memento(state);
    }

    public void restore (Memento memento){
        this.state = memento.getState();
    }
}
