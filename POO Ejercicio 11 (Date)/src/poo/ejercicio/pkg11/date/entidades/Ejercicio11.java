package poo.ejercicio.pkg11.date.entidades;

import java.util.Date;

public class Ejercicio11 {

    private Date fechatipeada;

    public Ejercicio11() {
    }

    public Ejercicio11(Date fechatipeada) {
        this.fechatipeada = fechatipeada;
    }

    public Date getFechatipeada() {
        return fechatipeada;
    }

    public void setFechatipeada(Date fechatipeada) {
        this.fechatipeada = fechatipeada;
    }

    public void llenarfecha(Date fecha) {

        this.fechatipeada = fecha;
    }
}
