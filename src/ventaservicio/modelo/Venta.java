/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventaservicio.modelo;

import java.sql.Date;

/**
 *
 * @author Cèsar
 */
public class Venta {
    
    private int idVenta;
    private Date fechaContrato;
    private Date fechaTerminoOpcional;
    private Date fechaTermino;
    private String tipoVenta;
    private int valorVenta;
    private String rut;
    private int precio;
    private int cantidad;

    public Venta() {
    }

    public Venta(int idVenta, Date fechaContrato, Date fechaTerminoOpcional, Date fechaTermino, String tipoVenta, int valorVenta, String rut, int precio, int cantidad) {
        this.idVenta = idVenta;
        this.fechaContrato = fechaContrato;
        this.fechaTerminoOpcional = fechaTerminoOpcional;
        this.fechaTermino = fechaTermino;
        this.tipoVenta = tipoVenta;
        this.valorVenta = valorVenta;
        this.rut = rut;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public Date getFechaTerminoOpcional() {
        return fechaTerminoOpcional;
    }

    public void setFechaTerminoOpcional(Date fechaTerminoOpcional) {
        this.fechaTerminoOpcional = fechaTerminoOpcional;
    }

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public int getValorVenta() {
        return valorVenta;
    }

    public void setValorVenta(int valorVenta) {
        this.valorVenta = valorVenta;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
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
