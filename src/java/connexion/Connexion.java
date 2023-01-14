/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

/**
 *
 * @author michael
 */
import java.sql.*;

public class Connexion {
    private Connection con;
    private PreparedStatement stm;
    private ResultSet rs;
    
    static String DB = "imprimerie";
    static String User = "postgres";
    static String Password = "michael";
    
    public Connexion(String request) {
        try {
            Class.forName("org.postgresql.Driver");
            this.con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+DB,User,Password);
            this.stm = getConnection().prepareStatement(request);   
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {}
    }
    public void Execute() {
        try {
            this.rs = this.stm.executeQuery();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {}
    }
    //PreparedStatement + ResultSet + Connection
    public void Close() {
        try {
            getResultSet().close();
            getPreparedStatement().close();
            getConnection().close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {}
    }
    //PreparedStatement + Connection
    public void Closed() {
        try {
            getPreparedStatement().close();
            getConnection().close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        finally {}
    }
    //ResultSet + Connection
    public void CloseBasic() {
        try {
            getResultSet().close();
            getConnection().close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {}
    }
    //Connection
    public void CloseConnection() {
        try {
            getConnection().close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {}
    }
    
    public Connection getConnection() {
        return con;
    }

    public void setConnection(Connection con) {
        this.con = con;
    }

    public PreparedStatement getPreparedStatement() {
        return stm;
    }

    public void setPreparedStatement(PreparedStatement stm) {
        this.stm = stm;
    }

    public ResultSet getResultSet() {
        return rs;
    }

    public void setResultSet(ResultSet rs) {
        this.rs = rs;
    }
}
