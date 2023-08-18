/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package APP;
import java.sql.*;

public class Conexion {
    public static Connection getConexion(){
        
        String url = "jdbc:sqlserver://localhost:1433;"
                          +"databaseName=Escuela;"
                          +"user=Escuela;"
                          +"password=mon123;";
        
        try{
            Connection conx = DriverManager.getConnection(url);
            return conx;  
        }catch(SQLException e){
            System.out.println(e.toString());
            return null;
        }
    
}
}
