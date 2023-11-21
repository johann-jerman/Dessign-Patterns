package Creationals.Singelton.Java;

public class Conection {
    //get a static instance of my class
    private  static  Conection instance;

    //private contructor for avoid intance whith new Concetion
    private Conection() {
    }

    // replace new Concetion, retuning existing intanse of class
    public static Conection getInstance () {
        if (instance == null) {
            return instance = new Conection();
        }
        return instance;
    }

    //method and getter setter etc.
    public void connect(){
        System.out.println("conect");
    }
    public void disconnect(){
        System.out.println("disconnect");
    }
}
