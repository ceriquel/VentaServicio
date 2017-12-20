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
    private Date fechaTermino;
    private int tipoVenta;
    private int valorVenta;
    private String rut;

    public Venta() {
    }

    public Venta(int idVenta, Date fechaContrato, Date fechaTermino, int tipoVenta, int valorVenta, String rut) {
        this.idVenta = idVenta;
        this.fechaContrato = fechaContrato;
        this.fechaTermino = fechaTermino;
        this.tipoVenta = tipoVenta;
        this.valorVenta = valorVenta;
        this.rut = rut;
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

    public Date getFechaTermino() {
        return fechaTermino;
    }

    public void setFechaTermino(Date fechaTermino) {
        this.fechaTermino = fechaTermino;
    }

    public int getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(int tipoVenta) {
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
    
    
}
