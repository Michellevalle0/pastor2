/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.pastor.persistencia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import mx.itson.pastor.entidades.Movimiento;
/**
 *
 * @author michelle
 */
public class MovimientoDAO {
    
    public static boolean agregar (Movimiento movimiento,int idCuenta){
        boolean resultado=false;
        try {
            Connection con = Conexion.obtener();
            String consulta="INSERT INTO `pastor`.`movimiento` (`concepto`, `fecha`, `importe`, `tipo`, `cuenta`) VALUES (?, ?, ?, ?, ?);";
            
            PreparedStatement st =con.prepareStatement(consulta);
            st.setString(1, movimiento.getConcepto());
            st.setString(2, String.valueOf(movimiento.getFecha()));
            st.setDouble(3, movimiento.getImporte());
            switch(movimiento.getTipo()){
                case ABONO:
                    st.setInt(4, 1);
                    break;
                case CARGO:
                    st.setInt(4, 2);
                    break;
             }
            st.setInt(5, idCuenta);
            ResultSet rs = st.
            resultado = st.execute();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    
    
    
    
    return resultado;
    
    }
    
    
}
