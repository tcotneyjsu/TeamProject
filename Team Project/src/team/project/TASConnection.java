/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.*;
package team.project;

/**
 *
 * @author Travis
 */
public class TASConnection {
    private Connection con;
    private Statement state;
    private ResultSet set;

    public TASConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost/tas";
            Connection conn = DriverManager.getConnection(url, username,
                              password);
        }catch(Exception e){}
        
    }
    
}
