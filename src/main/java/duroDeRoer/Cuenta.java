/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duroDeRoer;

/**
 *
 * @author LuisMiguel
 */
public class Cuenta {
    
    private String titular;
    private double cantidad;
    
    public Cuenta(String titular){
        this(titular,0);        
    }
    
    public Cuenta(String titular, double cantidad){
        this.titular=titular;
        this.cantidad=cantidad;
    }

    public String getTitular() {
        return "El titular de la cuenta es: " + titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCantidad() {
        return "La cantidad en cuenta es de: " + cantidad + "€";
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    public double Ingresar(double cantidad){
        this.cantidad+=cantidad;
        return cantidad;    
    }
    
    public double Retirar(double cantidad){
        this.cantidad-=cantidad;
        return cantidad;
    }
    
}
