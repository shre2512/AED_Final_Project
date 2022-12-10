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
            PreparedStatement create_orders = con.prepareStatement("CREATE TABLE IF NOT EXISTS orders(id int NOT NULL AUTO_INCREMENT, user_id INT, product VARCHAR(255), order_total INT, item_type VARCHAR(255), PRIMARY KEY(id))");
            PreparedStatement create_pet_accessories = con.prepareStatement("CREATE TABLE IF NOT EXISTS petaccessories(id int NOT NULL AUTO_INCREMENT, accessory_name VARCHAR(255), accessory_price int, available_quantity int, PRIMARY KEY(id))");
            PreparedStatement create_grooming_appointments = con.prepareStatement("CREATE TABLE IF NOT EXISTS groomingappointments(id int NOT NULL AUTO_INCREMENT, user_id INT, service_name VARCHAR(255), service_cost VARCHAR(255), service_date VARCHAR(255), PRIMARY KEY(id))");
            PreparedStatement create_hospitals = con.prepareStatement("CREATE TABLE IF NOT EXISTS hospitals(id int NOT NULL AUTO_INCREMENT, city_name VARCHAR(255), community_name VARCHAR(255), hospital_name VARCHAR(255), hospital_zipcode VARCHAR(255), PRIMARY KEY(id))");
            PreparedStatement create_doctors = con.prepareStatement("CREATE TABLE IF NOT EXISTS doctors(id int NOT NULL AUTO_INCREMENT, first_name VARCHAR(255), last_name VARCHAR(255), email_ID VARCHAR(255), contact_number VARCHAR(255), hospital_name VARCHAR(255), username VARCHAR(255), password VARCHAR(255), PRIMARY KEY(id))");
                    
            create_usertable.executeUpdate();
            create_petfood.executeUpdate();
            create_orders.executeUpdate();
            create_pet_accessories.executeUpdate();
            create_grooming_appointments.executeUpdate();
            create_hospitals.executeUpdate();
            create_doctors.executeUpdate();
            
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
    
    public void executePetAccessoryUpdate(String query, int quantity, String accessoryName) throws Exception
    {
        PreparedStatement updateQty = con.prepareStatement(query);
        updateQty.setInt(1,quantity);
        updateQty.setString(2,accessoryName);
        updateQty.executeUpdate();   
    }
    
    public void executePetFoodUpdate(String query, int foodPrice, int id) throws Exception
    {
        PreparedStatement updateQty = con.prepareStatement(query);
        updateQty.setInt(1,foodPrice);
        updateQty.setInt(2, id);
        updateQty.executeUpdate();   
    }
    
    public void insertOrderItem(int userId, int applawsOrderPrice, int pedigreeOrderPrice, int naturalsOrderPrice, int tikiCatOrderPrice) throws Exception
    {        
        if(applawsOrderPrice != 0)
        {
            PreparedStatement insertOrder = con.prepareStatement("INSERT INTO orders (user_id, product, order_total, item_type) VALUES (?, ?, ?, ?)");
            insertOrder.setInt(1, userId);
            insertOrder.setString(2, "Applaws");
            insertOrder.setInt(3, applawsOrderPrice);
            insertOrder.setString(4, "Food");
            insertOrder.executeUpdate();
        }
        
        if(pedigreeOrderPrice != 0)
        {
            PreparedStatement insertOrder = con.prepareStatement("INSERT INTO orders (user_id, product, order_total, item_type) VALUES (?, ?, ?, ?)");
            insertOrder.setInt(1, userId);
            insertOrder.setString(2, "Pedigree");
            insertOrder.setInt(3, pedigreeOrderPrice);
            insertOrder.setString(4, "Food");
            insertOrder.executeUpdate();
        }
                
        if(naturalsOrderPrice != 0)
        {
            PreparedStatement insertOrder = con.prepareStatement("INSERT INTO orders (user_id, product, order_total, item_type) VALUES (?, ?, ?, ?)");
            insertOrder.setInt(1, userId);
            insertOrder.setString(2, "Naturals");
            insertOrder.setInt(3, naturalsOrderPrice);
            insertOrder.setString(4, "Food");
            insertOrder.executeUpdate();
        }
        
        if(tikiCatOrderPrice != 0)
        {
            PreparedStatement insertOrder = con.prepareStatement("INSERT INTO orders (user_id, product, order_total, item_type) VALUES (?, ?, ?, ?)");
            insertOrder.setInt(1, userId);
            insertOrder.setString(2, "Tiki Cat");
            insertOrder.setInt(3, tikiCatOrderPrice);
            insertOrder.setString(4, "Food");
            insertOrder.executeUpdate();
        }  
    }
    
    public void insertOrderItemA(int userId, int latexToysOrderPrice, int chuckitOrderPrice, int nylaboneOrderPrice, int collarNecklacePrice) throws Exception
    {        
        if(latexToysOrderPrice != 0)
        {
            PreparedStatement insertOrder = con.prepareStatement("INSERT INTO orders (user_id, product, order_total, item_type) VALUES (?, ?, ?, ?)");
            insertOrder.setInt(1, userId);
            insertOrder.setString(2, "Latex Toys");
            insertOrder.setInt(3, latexToysOrderPrice);
            insertOrder.setString(4, "Accessory");
            insertOrder.executeUpdate();
        }
        
        if(chuckitOrderPrice != 0)
        {
            PreparedStatement insertOrder = con.prepareStatement("INSERT INTO orders (user_id, product, order_total, item_type) VALUES (?, ?, ?, ?)");
            insertOrder.setInt(1, userId);
            insertOrder.setString(2, "Chuckit");
            insertOrder.setInt(3, chuckitOrderPrice);
            insertOrder.setString(4, "Accessory");
            insertOrder.executeUpdate();
        }
                
        if(nylaboneOrderPrice != 0)
        {
            PreparedStatement insertOrder = con.prepareStatement("INSERT INTO orders (user_id, product, order_total, item_type) VALUES (?, ?, ?, ?)");
            insertOrder.setInt(1, userId);
            insertOrder.setString(2, "Nylabone");
            insertOrder.setInt(3, nylaboneOrderPrice);
            insertOrder.setString(4, "Accessory");
            insertOrder.executeUpdate();
        }
        
        if(collarNecklacePrice != 0)
        {
            PreparedStatement insertOrder = con.prepareStatement("INSERT INTO orders (user_id, product, order_total, item_type) VALUES (?, ?, ?, ?)");
            insertOrder.setInt(1, userId);
            insertOrder.setString(2, "Collar Necklace");
            insertOrder.setInt(3, collarNecklacePrice);
            insertOrder.setString(4, "Accessory");
            insertOrder.executeUpdate();
        }  
    }
    
    
    public ResultSet executeSelect(int userID) throws Exception
    {
        PreparedStatement select = con.prepareStatement("SELECT item_type, product, SUM(order_total) as total_user_orders FROM orders WHERE user_id = ? GROUP BY item_type, product");
        select.setInt(1, userID);
        ResultSet result = select.executeQuery();
        return result;
    }
    
    public void insertHospitals(String city_name, String community_name, String hospital_name, String hospital_zipcode) throws Exception
    {
        PreparedStatement insertOrder = con.prepareStatement("INSERT INTO hospitals (city_name, community_name, hospital_name, hospital_zipcode) VALUES (?, ?, ?, ?)");
        insertOrder.setString(1, city_name);
        insertOrder.setString(2, community_name);
        insertOrder.setString(3, hospital_name);
        insertOrder.setString(4, hospital_zipcode);
        insertOrder.executeUpdate();
    }
    
    public void insertDoctors(String first_name, String last_name, String email_ID, String contact_number, String hospital_name, String username, String password) throws Exception
    {
        PreparedStatement insertOrder = con.prepareStatement("INSERT INTO doctors(first_name, last_name, email_ID, contact_number, hospital_name, username, password) VALUES (?, ?, ?, ?, ?, ?, ?)");
        insertOrder.setString(1, first_name);
        insertOrder.setString(2, last_name);
        insertOrder.setString(3, email_ID);
        insertOrder.setString(4, contact_number);
        insertOrder.setString(5, hospital_name);
        insertOrder.setString(6, username);
        insertOrder.setString(7, password);
        insertOrder.executeUpdate();
    }
 
}
