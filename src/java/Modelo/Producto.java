/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Producto {
   private int idproducto;
   private String nombre;
   private String email;
   private String fecha;
   private int cantidad;
   private int precio;
   private String estado;
    
    public Producto(){
    } 

    public Producto(int idproducto, String nombre, String email, String fecha, int cantidad, int precio, String estado) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.email = email;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdproducto() {
        return idproducto;
    }
    
    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  
}
