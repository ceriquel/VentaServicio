/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaservicio.modelo;

import java.sql.SQLException;
import java.sql.Statement;
import ventaservicio.conexion.Conexion;

/**
 *
 * @author Cèsar
 */
public class ModeloEliminar {
    
     public void borrarVenta(int idVenta) throws SQLException{
        System.out.println("Borrar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1= "DELETE FROM VENTA WHERE ID_VENTA="+idVenta;
        dec.executeUpdate(query1);
     }
    
}
