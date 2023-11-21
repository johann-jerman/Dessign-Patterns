package Behavioral.Memento.Java;


import Behavioral.Memento.Java.Class.Caretaker;
import Behavioral.Memento.Java.Class.Game;
import Behavioral.Memento.Java.Class.Originator;

public class Main {
    public static void main(String[] args) {
        String gameName = "Leage of Legends";

        Game game = new Game();

        game.setName(gameName);
        game.setCheckpoint(1);

        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();
        game.setCheckpoint(2);
        originator.setState(game);
        caretaker.addMemento(originator.save());
        game.setCheckpoint(5);
        originator.setState(game);
        originator.restore(caretaker.getMemento(2));
        game = originator.getState();
    }

}
