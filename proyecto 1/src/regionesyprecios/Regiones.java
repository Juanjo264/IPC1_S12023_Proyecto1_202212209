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
public class Regiones {
    public static ArrayList<Region> regiones = new ArrayList<>();

     

    public static void agregarRegion(Region region) {
        regiones.add(region);
    }

    public static void eliminarRegion(Region region) {
        regiones.remove(region);
    }

    public static void editarRegion(int indice, String nuevoNombre, double nuevoPrecioEstandar, double nuevoPrecioEspecial) {
        
       
        Region region = regiones.get(indice);
        region.setNombreRegion(nuevoNombre);
        region.setPrecioEstandar(nuevoPrecioEstandar);
        region.setPrecioEspecial(nuevoPrecioEspecial);
    }

    public static  ArrayList<Region> getRegiones() {
        return regiones;
    }
    
}


