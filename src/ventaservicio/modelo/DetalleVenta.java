/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaservicio.modelo;

/**
 *
 * @author Cèsar
 */
public class DetalleVenta {
    private int idVenta;
    private int idProducto;
    private int precio;
    private int cantidad;

    public DetalleVenta() {
    }

    public DetalleVenta(int idVenta, int idProducto, int precio, int cantidad) {
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
