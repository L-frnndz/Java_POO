package poo.ejercicio.pkg6.nespresso.Servicio;

import java.util.Scanner;
import poo.ejercicio.pkg6.nespresso.Entidades.Cafetera;

public class NespressoServicio {

    Scanner leer = new Scanner(System.in);

    public Cafetera crearCafetera() {

        Cafetera caf = new Cafetera();
        caf.setCantidadActual(0);
        caf.setCapacidadMaxima(100);
        return caf;
    }

    public void llenarCafetera(Cafetera caf) {

        caf.setCantidadActual(caf.getCapacidadMaxima());
        System.out.println("Capacidad maxima alcanzada(100).");
    }

    public int servirTaza(Cafetera caf) {

        int taza, cantidad, resta, tamaño;
        System.out.println("Ingrese el tamaño de la taza");
        tamaño = leer.nextInt();
        System.out.println("Indique la cantidad de cafe que quiere en su taza");
        cantidad = leer.nextInt();
        taza = tamaño;
        //si la cantidad actual es menor a la indicada
        if (caf.getCantidadActual() < cantidad) {
            System.out.println("La taza contiene " + caf.getCantidadActual());
            caf.setCantidadActual(0);
        } else if (cantidad == taza) {
            System.out.println("La taza esta llena.");
            resta = caf.getCantidadActual() - cantidad;
            caf.setCantidadActual(resta);
        } else {
            System.out.println("La taza contiene " + cantidad);
            resta = caf.getCantidadActual() - cantidad;
            caf.setCantidadActual(resta);
        }

        return taza;
    }

    public void vaciarCafeetera(Cafetera caf) {

        caf.setCantidadActual(0);
        System.out.println("La cafetera se ha vaciado.");
    }

    public int agregarCafe(Cafetera caf) {
        Scanner leer = new Scanner(System.in);
        int rellenar;
        System.out.println("Indique la cantidad de cafe que quiera ingresar a la cafetera.");
        rellenar = leer.nextInt();
        caf.setCantidadActual(rellenar);
        return caf.getCantidadActual();
    }
}
