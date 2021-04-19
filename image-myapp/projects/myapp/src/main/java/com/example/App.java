package com.example;
import java.sql.*;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    protected   static  String              tblName = "TestTable";
    protected   static  String              namespace = "USER";
    protected   static  String              host = "localhost";
    protected   static  int                 port = 1972; 
    protected   static  String              url = "jdbc:IRIS://"+host+":" + port + "/"+namespace;
    protected   static  String              username = "SuperUser";
    protected   static  String              password = "sys";
    

    public static void main( String[] args )
    {
        Connection dbconnection = null;
        PreparedStatement pstmt = null;

        System.out.println( "Hello World!!!!!" );

        try {
            Class.forName ("com.intersystems.jdbc.IRISDriver");
            Properties p = new Properties();
            p.setProperty("SharedMemory", "false");
            p.setProperty("user", username);
            p.setProperty("password", password);
            dbconnection = DriverManager.getConnection(url,p);
            dbconnection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            dbconnection.setAutoCommit(true);

    		pstmt = dbconnection.prepareStatement("SELECT 1)");
 			pstmt.execute();
			pstmt.close();


        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                dbconnection.close();
            } catch (Exception ex) {
            }
        }    

    }
}
