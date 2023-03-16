/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetasdecredito;

import java.util.ArrayList;
import modelo.dao.Usuario;

/**
 *
 * @author juanj
 */
public class Tarjetas {
private static ArrayList<Tarjeta> listaTarjetas = new ArrayList<Tarjeta>();

    public static void agregarTarjeta(Tarjeta tarjeta) {
        listaTarjetas.add(tarjeta);
    }

    public static ArrayList<Tarjeta> getListaTarjetas() {
        return listaTarjetas;
    }
}
