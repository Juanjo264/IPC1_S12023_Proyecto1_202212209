/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package regionesyprecios;

import java.util.ArrayList;

/**
 *
 * @author juanj
 */
public class Region {
    private String codigoregion;
    private String nombreRegion;
    private double precioEstandar;
    private double precioEspecial;
    private String departamento;
    private String municipio;

    
    
    

    public Region(String codigoregion, String nombreRegion, double precioEstandar, double precioEspecial, String departamento, String municipio) {
        this.codigoregion = codigoregion;
        this.nombreRegion = nombreRegion;
        this.precioEstandar = precioEstandar;
        this.precioEspecial = precioEspecial;
        this.departamento = departamento;
        this.municipio = municipio;

 
    }
    
    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
 
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

   
    public String getCodigoregion() {
        return codigoregion;
    }

    public void setCodigoregion(String codigoregion) {
        this.codigoregion = codigoregion;
    }

    public String getNombreRegion() {
        return nombreRegion;
    }

    public void setNombreRegion(String nombreRegion) {
        this.nombreRegion = nombreRegion;
    }

    public double getPrecioEstandar() {
        return precioEstandar;
    }

    public void setPrecioEstandar(double precioEstandar) {
        this.precioEstandar = precioEstandar;
    }

    public double getPrecioEspecial() {
        return precioEspecial;
    }

    public void setPrecioEspecial(double precioEspecial) {
        this.precioEspecial = precioEspecial;
    }
    
}
 
