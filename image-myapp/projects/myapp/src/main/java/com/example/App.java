package com.example;
import java.sql.*;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    protected   static  String              namespace = "USER";
    protected   static  String              host = "irishost";
    protected   static  int                 port = 1972; 
    protected   static  String              url = "jdbc:IRIS://"+host+":" + port + "/"+namespace;
    protected   static  String              username = "SuperUser";
    protected   static  String              password = "SYS";
    

    public static void main( String[] args )
    {
        Connection dbconnection = null;
        PreparedStatement pstmt = null;

        System.out.println( "Connecting to IRIS server on "+host );

        try {
            Class.forName ("com.intersystems.jdbc.IRISDriver");
            Properties p = new Properties();
            p.setProperty("SharedMemory", "false");
            p.setProperty("user", username);
            p.setProperty("password", password);
            dbconnection = DriverManager.getConnection(url,p);
            dbconnection.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
            dbconnection.setAutoCommit(true);

    		pstmt = dbconnection.prepareStatement("SELECT 1 col1");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("col1"));
            }
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
