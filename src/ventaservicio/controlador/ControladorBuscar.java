/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaservicio.controlador;

import java.sql.SQLException;
import ventaservicio.modelo.ModeloBuscar;
import ventaservicio.modelo.Venta;

/**
 *
 * @author Cèsar
 */
public class ControladorBuscar {
    
     private ModeloBuscar modeloBuscar;
    
     public Venta buscarVenta(int idVenta) throws SQLException{
         modeloBuscar=new ModeloBuscar();
         return modeloBuscar.buscarVenta(idVenta);
         
     }
    
}
