/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.admin;

/**
 *
 * @author juanj
 */
public class Admin {
    
    private String codigok;
    private String nombrek;
    private String codigoRegion;

    public Admin(String codigok, String nombrek, String codigoRegion) {
        this.codigok = codigok;
        this.nombrek = nombrek;
        this.codigoRegion = codigoRegion;
    }

    public String getCodigok() {
        return codigok;
    }

    public void setCodigok(String codigok) {
        this.codigok = codigok;
    }

    public String getNombrek() {
        return nombrek;
    }

    public void setNombrek(String nombrek) {
        this.nombrek = nombrek;
    }

    public String getCodigoRegion() {
        return codigoRegion;
    }

    public void setCodigoRegion(String codigoRegion) {
        this.codigoRegion = codigoRegion;
    }

   
}


