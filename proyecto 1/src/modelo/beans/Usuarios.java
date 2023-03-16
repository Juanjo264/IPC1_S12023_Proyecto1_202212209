/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.beans;

/**
 *
 * @author juanj
 */
import java.util.ArrayList;
import modelo.dao.Usuario;

public class Usuarios {
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public static void agregarUsuario(Usuario usuario) {
        listaUsuarios.add(usuario);
    }

    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

 
   
}
       
    

