/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaservicio.controlador;

import java.sql.SQLException;
import ventaservicio.modelo.ModeloEliminar;

/**
 *
 * @author Cèsar
 */
public class ControladorEliminar {
    
     private ModeloEliminar modeloBorrar;
    
    public void borrarVenta(int idVenta) throws SQLException{
        modeloBorrar=new ModeloEliminar();
        modeloBorrar.borrarVenta(idVenta);
    }
}
