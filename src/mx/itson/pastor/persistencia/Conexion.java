/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pastor.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Michelle
 */
public class Conexion {
    
    public static Connection obtener(){
        Connection conexion = null;
        try {
            conexion = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/pastordb?user=root&password=admin");
        } catch(Exception e){
            System.err.print(e.getMessage());
        }
        return conexion;
    }
}
