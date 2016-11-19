/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.logging.Level;
    import java.util.logging.Logger;
/**
 *
 * @author Jefri
 */
public class Database {
    private String dbURL = "jdbc:mysql://localhost/dbInventaris";
    private String dbUser = "root";
    private String dbPass = "kelompok3";
    private Statement stmt = null;
    private Connection con = null;
    private ResultSet rs = null;

public Database(){
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
        } catch (Exception e){
            System.out.println("Error Driver");
        }
        try{
            con = DriverManager.getConnection(dbURL,dbUser,dbPass);
        } catch (Exception e){
            System.out.println("Error Koneksi");
        }
    }
    
    public ResultSet getData(String SQLString){
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);
        } catch (Exception e) {
            System.out.println("Error Ambil Data");
        }
        return  rs;
    }
    
    public void query(String SQLString){
        try {
            stmt = con.createStatement();
            stmt.executeUpdate(SQLString);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public void closeConn(){
        try {
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}


