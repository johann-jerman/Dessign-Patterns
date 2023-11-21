package Creationals.Factory.Java.Impl;

import Creationals.Factory.Java.Interfaces.IConction;


public class ConnectionPostgres implements IConction {
    private String Host;
    private String Password;
    private String Username;
    private String Database;

    public ConnectionPostgres(String host, String password, String username, String database) {
        Host = host;
        Password = password;
        Username = username;
        Database = database;
    }

    @Override
    public void connection() {
        System.out.println("conected");
    }

    @Override
    public void disconnect() {
        System.out.println("desconected");
    }
}
