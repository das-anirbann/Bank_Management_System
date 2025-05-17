package bank.management.system;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conn{
    public Connection connect;
    public Statement statement;
    public Conn(){

        try{
            connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "Ianirban@123")
            statement = connect.createStatement();

        }catch(Exception e){
           e.printStackTrace();
        }
    }
}
