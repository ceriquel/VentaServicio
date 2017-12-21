/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaservicio.modelo;

import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Cèsar
 */
public class ModeloAgregar {
    
    public boolean agregarPelicula(String tipo_venta, String producto, int precio, int cantidad, Date fechacontra, Date fechaterm,Date fechafinc,int rut, int valorventa) throws SQLException{
        boolean flag=false;
        System.out.println("Insertar registro...");
        Statement dec;
        dec=Conexion.conexion.createStatement();
        String query1="insert into VENTA (ID_VENTA, FECHA_CONTRATACION, FECHA_TERMINO_OPCIONAL, FECHA_TERMINO_CONTRATO, TIPO_VENTA_ID_TIPO, VALOR_VENTA) VALUES ("+precio+", (SELECT ID_CATEGORIA FROM CATEGORIA WHERE NOMBRE_CATEGORIA='"+categoria+"'), '"+formato4k+"', '"+nombre+"')";
        dec.executeUpdate(query1);
        return flag=true;    
    }
    
    
    
}
