package Creationals.Factory.Java;

import Creationals.Factory.Java.Interfaces.IConction;

public class Main {
    public static void main(String[] args) {
        //incese of factory
        ConnectionFactory factory = new ConnectionFactory();
        //get a instance of connection
        IConction MySql = factory.getConnection("host", "password", "username", "database" , "MySql");
        MySql.connection();
        MySql.disconnect();

    }
}
