/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosdefacturacion;

import java.util.ArrayList;

/**
 *
 * @author juanj
 */
public class Datosdefacturacion {
    private static ArrayList<Datodefacturacion> listaDatofacturas = new ArrayList<Datodefacturacion>();

    public static void agregarDatofactura(Datodefacturacion datodefacturacion) {
        listaDatofacturas.add(datodefacturacion);
    }

    public static ArrayList<Datodefacturacion> getListaDatosdefacturacion() {
        return listaDatofacturas;
    }

 
}
