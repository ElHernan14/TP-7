/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp7.colecciones;

/**
 *
 * @author Hernan57
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    private long dni;
    
    public Cliente(String n, String a, String c, String d, long dni){
        this.nombre=n;
        this.apellido=a;
        this.ciudad=c;
        this.direccion=d;
        this.dni=dni;
    }
    public Cliente(String n, String a, String c, long dni){
        this.nombre=n;
        this.apellido=a;
        this.ciudad=c;
        this.dni=dni;
    }
    
    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
        return nombre + " " + apellido;
    }
}
