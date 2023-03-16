/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosdefacturacion;

/**
 *
 * @author juanj
 */
public class Datodefacturacion {
     private String nombrecompleto;
    private String direccion;
    private String nit;

    public Datodefacturacion(String nombrecompleto, String direccion, String nit) {
        this.nombrecompleto = nombrecompleto;
        this.direccion = direccion;
        this.nit = nit;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    
    
}
