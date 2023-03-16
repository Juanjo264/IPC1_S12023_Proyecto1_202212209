/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.logic;

import modelo.beans.Usuario;
import modelo.dao.usuariodao;

/**
 *
 * @author juanj
 */
public class usuariologic {
    private static  usuariodao UsuarioDAO = new usuariodao() ;
    
    public static boolean autentificar(String usuario, String Contrasena){
        if (obtener(usuario) !=null ) {
            Usuario usuarioconsulta=obtener(usuario);
            if (usuarioconsulta.getUsuario().equals(usuario) && usuarioconsulta.getContrasena().equals(Contrasena)) {
            return true;
            } else {
                return false;
            }
            
        } else {
             return false;
        }
            
    }
    public static boolean insertar(Usuario usuario){
        return UsuarioDAO.insertar(usuario);
            
            }
    public static boolean modificar(Usuario usuario){
                return UsuarioDAO.modificar(usuario);

            
            }
    public static boolean eliminar(String usuario){
                return UsuarioDAO.eliminar(usuario);

            
            }
    public static Usuario obtener(String usuario){
                return UsuarioDAO.obtener(usuario);

            
            }
    
    
}
