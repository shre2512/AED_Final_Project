/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author shrey
 */

public class databaseConnection {
    
    public Connection con;
    private static int orderId = 0;
    
    public databaseConnection()
    {
        try {
            this.con = createTables();
        } catch (Exception ex) {
            Logger.getLogger(databaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private static Connection createTables() throws Exception{
        try{
            Connection con = getConnection();
            PreparedStatement create_usertable = con.prepareStatement("CREATE TABLE IF NOT EXISTS usertable(id int NOT NULL AUTO_INCREMENT, first_name VARCHAR(255), last_name VARCHAR(255), email_id VARCHAR(255), phone_number VARCHAR(255), user_name VARCHAR(255), password VARCHAR(255), PRIMARY KEY(id))");
            PreparedStatement create_petfood = con.prepareStatement("CREATE TABLE IF NOT EXISTS petfood(id int NOT NULL AUTO_INCREMENT, food_name VARCHAR(255), food_price int, available_quantity int, PRIMARY KEY(id))");
            create_usertable.executeUpdate();
            create_petfood.executeUpdate();
            return con;
        } catch(Exception e){System.out.println(e);}
        finally{System.out.println("Table Created!");
        }
        return null;
    }
    
    private static Connection getConnection() throws Exception{
        try{

            Properties prop = new Properties();
            InputStream input = null;
            input = new FileInputStream("config.properties");
            prop.load(input);

            String username = prop.getProperty("dbUserName");
            String password = prop.getProperty("dbPassword");

            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/aed_project";

            Class.forName(driver);

            Connection conn = DriverManager.getConnection(url,username, password);
            System.out.println("Connected");
            return conn;
           } catch(Exception e){System.out.println(e);}

            return null;
    } 
    
    public ResultSet executeSelect(String query) throws Exception
    {
        PreparedStatement select = con.prepareStatement(query);
        ResultSet result = select.executeQuery();
        return result;
    }
    
    public void executeInsert(String query) throws Exception
    {
        PreparedStatement insert = con.prepareStatement(query);
        insert.executeUpdate();
    }
    
    public void executePetFoodUpdate(String query, int quantity, String foodName) throws Exception
    {
        PreparedStatement updateQty = con.prepareStatement(query);
        updateQty.setInt(1,quantity);
        updateQty.setString(2,foodName);
        updateQty.executeUpdate();   
    }
    
    public void executePetFoodUpdate(String query, int foodPrice, int id) throws Exception
    {
        PreparedStatement updateQty = con.prepareStatement(query);
        updateQty.setInt(1,foodPrice);
        updateQty.setInt(2, id);
        updateQty.executeUpdate();   
    }
    
    public void insertOrderItem(int userId, String applaws, String pedigree, String naturals, String tikiCat, int applawsQty, int pedigreeQty, int naturalsQty, int tikiCatQty) throws Exception
    {
        if(applawsQty != 0)
        {
            
        }
    }
 
}
