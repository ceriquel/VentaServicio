/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaservicio.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ventaservicio.conexion.Conexion;

/**
 *
 * @author Cèsar
 */
public class ModeloBuscar {
    
     public Venta buscarVenta(int idVenta) throws SQLException{
        System.out.println("Buscar registro...");
        String sql="SELECT V.FECHA_CONTRATACION, V.FECHA_TERMINO_OPCIONAL, V.FECHA_TERMINO_CONTRATO, R.PRECIO, R.CANTIDAD FROM VENTA V JOIN RELATION_2V1 R ON V.ID_VENTA=R.VENTA_ID_VENTA WHERE ID_VENTA="+idVenta;
        System.out.println("ok");
        PreparedStatement preparedStatement;
        Venta venta=null;
        try {
            preparedStatement = Conexion.getInstance().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            venta = new Venta();
            venta.setFechaContrato(resultSet.getDate("FECHA_CONTRATACION"));
            venta.setFechaTerminoOpcional(resultSet.getDate("FECHA_TERMINO_OPCIONAL"));
            venta.setFechaTermino(resultSet.getDate("FECHA_TERMINO_CONTRATO"));
            venta.setPrecio(resultSet.getInt("PRECIO"));
            venta.setCantidad(resultSet.getInt("CANTIDAD"));
        }
         
        } catch (SQLException ex) {
            Logger.getLogger(ModeloBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return venta;
    }
     
    
}
