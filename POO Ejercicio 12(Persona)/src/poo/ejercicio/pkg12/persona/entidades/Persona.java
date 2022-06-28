package poo.ejercicio.pkg12.persona.entidades;

import java.util.Date;

public class Persona {

    private String nombre;
    private Date FechaDeNacimiento;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, Date FechaDeNacimiento, String apellido) {
        this.nombre = nombre;
        this.FechaDeNacimiento = FechaDeNacimiento;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
