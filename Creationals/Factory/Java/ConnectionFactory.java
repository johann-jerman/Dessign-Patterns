package Creationals.Factory.Java;

import Creationals.Factory.Java.Impl.ConnectionMySQL;
import Creationals.Factory.Java.Impl.ConnectionVoid;
import Creationals.Factory.Java.Interfaces.IConction;

public class ConnectionFactory {
    public ConnectionFactory() {
    }

    //return a instance of connection depends of DbMotor,
    // this method need to retun interface shared in all conections
    public IConction getConnection (String host, String password, String username, String database, String DbMotor){
        if (DbMotor.equalsIgnoreCase("MySql") ){
            return new ConnectionMySQL(host, password,username, database);
        }
        if (DbMotor.equalsIgnoreCase("Postgres") ){
            return new ConnectionMySQL(host, password,username, database);
        }
        if (DbMotor.equalsIgnoreCase("SqlServer") ){
            return new ConnectionMySQL(host, password,username, database);
        }
        return  new ConnectionVoid();
    }
}
