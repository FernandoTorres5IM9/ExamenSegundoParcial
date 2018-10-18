package mx.edu.ipn.cecyt9.edusite.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Alumno
 */
public class Conexion {
    
    //Variables de conexion
    Connection con = null;
    Statement state;
    ResultSet res;
    
    public Conexion(){
        
    }
    public void conecta(){//Metodo para conectar
        try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con = DriverManager.getConnection("jdbc:mysql://localhost/Examen","root","n0m3l0");
        System.out.println("Si conecta");
        
        }catch(Exception eeee){
            System.out.print("No conecta");
        }
    }
    public void cierra() throws SQLException{//Metodo para cerrar conexión
        con.close();
    }
    public Connection getConnection(){
        return con;
    }
    //Métodos para ejecutar sentencias SQL en la BD
    public int update(String update) throws SQLException{//Para hacer insert, update, o delete
        state = con.createStatement();
        return state.executeUpdate(update);
    }
    public ResultSet query(String query) throws SQLException{//Para hacer select
        state = con.createStatement();
        return state.executeQuery(query);
    }
}