/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Detalle {
    private int iddetalle;
    private String vendedor;
    private String producto;
    private int pventa;
    private int pcompra;
    private String estado;
    
    public Detalle(){
    } 

    public Detalle(int iddetalle, String vendedor, String producto, int pventa, int pcompra, String estado) {
        this.iddetalle = iddetalle;
        this.vendedor = vendedor;
        this.producto = producto;
        this.pventa = pventa;
        this.pcompra = pcompra;
        this.estado = estado;
    }

    public int getIddetalle() {
        return iddetalle;
    }
    
    public void setIddetalle(int iddetalle) {
        this.iddetalle = iddetalle;
    }

    public String getVendedor() {
        return vendedor;
    }
    
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getProducto() {
        return producto;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPventa() {
        return pventa;
    }
    
    public void setPventa(int pventa) {
        this.pventa = pventa;
    }

    public int getPcompra() {
        return pcompra;
    }
    
    public void setPcompra(int pcompra) {
        this.pcompra = pcompra;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  
}
