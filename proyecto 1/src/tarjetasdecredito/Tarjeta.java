/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetasdecredito;

import java.util.Date;

/**
 *
 * @author juanj
 */
public class Tarjeta {
    private String nombretarjeta;
    private String numerotarjeta;
    private Date fechav;

    public Tarjeta(String nombretarjeta, String numerotarjeta, Date fechav) {
        this.nombretarjeta = nombretarjeta;
        this.numerotarjeta = numerotarjeta;
        this.fechav = fechav;
    }

    public String getNombretarjeta() {
        return nombretarjeta;
    }

    public void setNombretarjeta(String nombretarjeta) {
        this.nombretarjeta = nombretarjeta;
    }

    public String getNumerotarjeta() {
        return numerotarjeta;
    }

    public void setNumerotarjeta(String numerotarjeta) {
        this.numerotarjeta = numerotarjeta;
    }

    public Date getFechav() {
        return fechav;
    }

    public void setFechav(Date fechav) {
        this.fechav = fechav;
    }

}
