package Behavioral.Memento.Java.Class;

public class Memento {
    private Game state;

    public Memento(Game state) {
        this.state = state;
    }

    public Game getState(){
        return this.state;
    }
}
