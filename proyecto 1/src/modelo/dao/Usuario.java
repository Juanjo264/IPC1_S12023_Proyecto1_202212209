/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.dao;

import java.util.Date;




/**a
    
 * @author juanj
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;

    private String usuario;
    private String telefono;
    private String dpi;
    private String genero;
    private String nacionalidad;
    private String tipoUsuario;
    private String tipokiosco;

    private String contrasena;
    private Date fechaNacimiento; 

    public Usuario(String nombre, String apellido,String correo, String usuario, String telefono, String dpi, String genero, String nacionalidad, String tipoUsuario,String tipokiosco, String contrasena, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.usuario = usuario;
        this.telefono = telefono;
        this.dpi = dpi;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.tipoUsuario = tipoUsuario;
        this.tipokiosco = tipokiosco;

        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipokiosco() {
        return tipokiosco;
    }

    public void setTipokiosco(String tipokiosco) {
        this.tipokiosco = tipokiosco;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
}
