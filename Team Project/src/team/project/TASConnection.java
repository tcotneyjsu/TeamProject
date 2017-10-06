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
    private ResultSet result;

    public TASConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost/tas";
            String username = "";//Kept empty for now because we will be Creating a project user 
            String password = "";//Kept empty for now because we will be Creating a project user                 
            Connection conn = DriverManager.getConnection(url, username,
                              password);
            state = conn.createStatement();
            result = stmt.executeQuery("SELECT * FROM badge WHERE id = '3282F212");
            if(result != null){
                result.next();
                String id = result.getString("id");
                String desc = resilt.getString("description");
            }
            result.close(0);
            state.close();
            con.close();
        }catch(Exception e){}
        
    }
    
}
