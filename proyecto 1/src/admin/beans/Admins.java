package admin.beans;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author juanj
 */
import java.util.ArrayList;
import modelo.admin.Admin;

public class Admins {
    public static ArrayList<Admin> listaKioscos = new ArrayList<>();

    public static void agregarAdmin(Admin admin) {
        listaKioscos.add(admin);
    }

    public static ArrayList<Admin> getListaAdmin() {
        return listaKioscos;
    }

 
   
}

